package chao.sample.spa.serviceimpl;

import android.app.Application;
import android.content.Context;

import chao.android.tools.servicepool.Spa;
import chao.java.tools.servicepool.annotation.Service;
import chao.sample.interfaces.thirdparty.ContextService;
import chao.sample.spa.App;

/**
 * @author luqin
 * @since 2020/9/12
 */
@SuppressWarnings("unused")
@Service(scope = Spa.Scope.GLOBAL, disableIntercept = true)
public class ContextServiceImpl implements ContextService {
    @Override
    public Application getApplication() {
        return App.sApp;
    }

    @Override
    public Context getApplicationContext() {
        return App.sApp.getApplicationContext();
    }
}
