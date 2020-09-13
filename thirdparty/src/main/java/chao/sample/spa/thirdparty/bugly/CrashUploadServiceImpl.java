package chao.sample.spa.thirdparty.bugly;

import com.tencent.bugly.crashreport.CrashReport;

import chao.android.tools.servicepool.Spa;
import chao.java.tools.servicepool.annotation.Service;
import chao.sample.interfaces.thirdparty.CrashUploadService;

/**
 * @author luqin
 * @since 2020/8/27
 */
@SuppressWarnings("unused")
@Service(scope = Spa.Scope.GLOBAL, disableIntercept = true)
public class CrashUploadServiceImpl implements CrashUploadService {
    @Override
    public void uploadCrash(Throwable e) {
        if (!BuglyInit.sInit) {
            BuglyInit.init();
        }
        CrashReport.postCatchedException(e);
    }
}
