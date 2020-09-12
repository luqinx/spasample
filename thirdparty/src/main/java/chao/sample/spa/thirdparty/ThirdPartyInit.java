package chao.sample.spa.thirdparty;

import android.content.Context;


import chao.java.tools.servicepool.IInitService;
import chao.java.tools.servicepool.ServicePool;
import chao.sample.interfaces.thirdparty.BuildService;
import chao.sample.interfaces.thirdparty.WXService;
import chao.sample.spa.thirdparty.bugly.BuglyInit;

import chao.android.tools.servicepool.Spa;
import chao.android.tools.servicepool.init.AndroidInitService;
import chao.java.tools.servicepool.Sp;
import chao.java.tools.servicepool.annotation.Init;
import chao.java.tools.servicepool.annotation.Service;

/**
 * @author luqin
 * @since 2020/8/24
 */
@Init(lazy = false, priority = Sp.Priority.MAX)
@Service
public class ThirdPartyInit implements IInitService {
    @Override
    public void onInit() {
        BuglyInit.init();
    }
}
