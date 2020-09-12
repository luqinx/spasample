package chao.sample.spa.thirdparty.statusbar;

import android.app.Activity;

import com.jaeger.library.StatusBarUtil;

import chao.java.tools.servicepool.annotation.Service;
import chao.sample.interfaces.thirdparty.StatusBarService;

/**
 * @author luqin
 * @since 2020/9/8
 */
@SuppressWarnings("unused")
@Service
public class StatusBarServiceImpl implements StatusBarService {

    @Override
    public void setTranslucent(Activity activity) {
        StatusBarUtil.setTranslucent(activity);
    }

    @Override
    public void setDarkMode(Activity activity) {
        StatusBarUtil.setDarkMode(activity);
    }

    @Override
    public void setColor(Activity activity, int i) {
        StatusBarUtil.setColor(activity, i, 0);
    }
}
