package chao.sample.spa.thirdparty;

import android.app.Application;

import chao.sample.spa.thirdparty.qiyu.QiyuManager;
import cn.bingoogolapple.swipebacklayout.BGASwipeBackHelper;

/**
 * @author luqin
 * @since 2020/9/4
 */
public class ThirdPartyDirectInit {

    public static void init(Application application) {
        BGASwipeBackHelper.init(application, null);

        QiyuManager.init(application); //小米mix3: 100ms上下

    }
}
