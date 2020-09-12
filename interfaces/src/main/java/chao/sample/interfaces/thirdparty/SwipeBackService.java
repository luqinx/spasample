package chao.sample.interfaces.thirdparty;

import android.app.Activity;

/**
 * @author luqin
 * @since 2020/9/12
 */
public interface SwipeBackService {
    void init(Activity activity);

    boolean isSliding();

    void backward();
}
