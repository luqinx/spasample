package chao.sample.spa.thirdparty.debug;

import android.content.Context;

import com.didichuxing.doraemonkit.DoraemonKit;


import chao.android.tools.servicepool.Spa;
import chao.android.tools.servicepool.init.AndroidInitService;
import chao.java.tools.servicepool.annotation.Init;
import chao.java.tools.servicepool.annotation.Service;
import chao.sample.interfaces.thirdparty.ContextService;

/**
 * @author luqin
 * @since 2020/8/24
 */
@Init(lazy = false)
@Service
public class ThirdPartyDebugInit extends AndroidInitService {

    @Override
    protected void onInit(Context applicationContext) {
        final ContextService contextService = Spa.getService(ContextService.class);

        DoraemonKit.install(contextService.getApplication(), "98da0bb873e4b198f2fa6b48501b0e9d");
    }
}
