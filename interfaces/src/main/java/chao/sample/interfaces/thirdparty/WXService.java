package chao.sample.interfaces.thirdparty;

import android.content.Context;

import chao.java.tools.servicepool.IService;

/**
 * @author luqin
 * @since 2020/9/12
 */
public interface WXService extends IService {
    void init(Context context);

    void auth(String state);
}
