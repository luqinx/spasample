package chao.sample.spa;

import android.app.Application;

import chao.android.tools.servicepool.Spa;
import chao.sample.spa.thirdparty.ThirdPartyDirectInit;

/**
 * @author luqin
 * @since 2020/9/12
 */
public class App extends Application {


    public static App sApp;

    @Override
    public void onCreate() {
        super.onCreate();
        sApp = this;

        Spa.init(this);

        ThirdPartyDirectInit.init(this);
    }
}
