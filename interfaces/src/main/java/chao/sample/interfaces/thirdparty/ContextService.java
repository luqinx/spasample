package chao.sample.interfaces.thirdparty;

import android.app.Application;
import android.content.Context;

import chao.java.tools.servicepool.IService;

/**
 * @author luqin
 * @since 2020/9/12
 */
public interface ContextService extends IService {
    Application getApplication();

    Context getApplicationContext();
}
