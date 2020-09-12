package chao.sample.interfaces.thirdparty;

import chao.java.tools.servicepool.IService;

/**
 * @author luqin
 * @since 2020/9/12
 */
public interface CrashUploadService extends IService {
    void uploadCrash(Throwable e);
}
