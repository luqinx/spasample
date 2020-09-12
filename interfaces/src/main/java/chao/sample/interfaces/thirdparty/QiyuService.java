package chao.sample.interfaces.thirdparty;

import android.content.Context;

/**
 * @author luqin
 * @since 2020/9/12
 */
public interface QiyuService {
    void login(String userId);

    void openService(Context context, String title);

    void openService(Context context, int titleRes);
}
