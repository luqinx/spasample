package chao.sample.interfaces.thirdparty;

import android.app.Activity;

import chao.java.tools.servicepool.IService;

/**
 * @author luqin
 * @since 2020/9/12
 */
public interface SwipeBackService extends IService {
    void init(Activity activity);

    boolean isSliding();

    void backward();
}
