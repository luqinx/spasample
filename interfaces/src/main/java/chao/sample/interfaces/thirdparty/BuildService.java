package chao.sample.interfaces.thirdparty;

import chao.java.tools.servicepool.IService;

/**
 * @author luqin
 * @since 2020/9/12
 */
public interface BuildService extends IService {
    String buglyId();

    boolean debuggable();

    String versionName();

    int versionCode();

    String applicationId();

    String buildType();
}
