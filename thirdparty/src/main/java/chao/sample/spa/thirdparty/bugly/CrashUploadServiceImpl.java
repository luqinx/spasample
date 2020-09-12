package chao.sample.spa.thirdparty.bugly;

import android.content.Context;

import com.tencent.bugly.crashreport.CrashReport;

import chao.android.tools.servicepool.Spa;
import chao.java.tools.servicepool.annotation.Service;
import chao.sample.interfaces.thirdparty.BuildService;
import chao.sample.interfaces.thirdparty.ContextService;
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
            Context context = Spa.getService(ContextService.class).getApplicationContext();
            BuglyInit.init(context, Spa.getService(BuildService.class));
        }
        CrashReport.postCatchedException(e);
    }
}
