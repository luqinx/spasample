package chao.sample.spa.thirdparty.qiyu;

import android.content.Context;

import com.netease.nimlib.sdk.StatusBarNotificationConfig;
import com.qiyukf.unicorn.api.ConsultSource;
import com.qiyukf.unicorn.api.Unicorn;
import com.qiyukf.unicorn.api.YSFOptions;
import com.qiyukf.unicorn.api.YSFUserInfo;

import chao.android.tools.servicepool.Spa;
import chao.java.tools.servicepool.annotation.Service;
import chao.sample.interfaces.thirdparty.QiyuService;

/**
 * @author luqin
 * @since 2020/8/25
 */
@Service(scope = Spa.Scope.GLOBAL, disableIntercept = true)
public final class QiyuManager implements QiyuService {

    private static Context appContext;


    public static void init(final Context applicationContext) {
        appContext = applicationContext;
        Unicorn.init(
                applicationContext,
                "9a3aabeccc9e6e947292f3ae38dc2460", //appKey
                options(applicationContext),
                new QiyuGlideImageLoader(applicationContext));
    }

    // 如果返回值为null，则全部使用默认参数。
    private static YSFOptions options(Context applicationContext) {
        YSFOptions options = new YSFOptions();
        options.statusBarNotificationConfig = new StatusBarNotificationConfig();
        options.gifImageLoader = new GlideGifImageLoader(applicationContext);
        options.logSwitch = false;
        return options;
    }


    @Override
    public void login(String userId) {
        YSFUserInfo userInfo = new YSFUserInfo();
        userInfo.userId = userId;
        Unicorn.setUserInfo(userInfo);
    }

    public void logout() {
        Unicorn.logout();
    }

    @Override
    public void openService(Context context, String title) {
        if (context == null) {
            context = appContext;
        }
        ConsultSource source = new ConsultSource(null, null, null);
        Unicorn.openServiceActivity(context, title, source);
    }

    @Override
    public void openService(Context context, int titleRes) {
        String title = appContext.getString(titleRes);
        openService(context, title);
    }


}
