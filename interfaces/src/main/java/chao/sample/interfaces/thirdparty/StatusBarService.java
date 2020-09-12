package chao.sample.interfaces.thirdparty;

import android.app.Activity;

/**
 * @author luqin
 * @since 2020/9/12
 */
public interface StatusBarService {
    void setTranslucent(Activity activity);

    void setDarkMode(Activity activity);

    void setColor(Activity activity, int i);
}
