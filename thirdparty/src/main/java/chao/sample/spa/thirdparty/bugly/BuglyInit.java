package chao.sample.spa.thirdparty.bugly;

import android.content.Context;
import android.text.TextUtils;

import com.tencent.bugly.crashreport.CrashReport;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import chao.android.tools.servicepool.Spa;
import chao.sample.interfaces.thirdparty.BuildService;
import chao.sample.interfaces.thirdparty.ContextService;

/**
 * @author luqin
 * @since 2020/8/24
 */
public class BuglyInit {

    static boolean sInit = false;

    public static void init() {
        ContextService contextService = Spa.getService(ContextService.class);
        Context context = contextService.getApplicationContext();

        // 获取当前包名
        String packageName = context.getPackageName();
        // 获取当前进程名
        String processName = getProcessName(android.os.Process.myPid());
        // 设置是否为上报进程
        CrashReport.UserStrategy strategy = new CrashReport.UserStrategy(context);
        strategy.setUploadProcess(processName == null || processName.equals(packageName));

        BuildService buildService = Spa.getService(BuildService.class);
        String buglyId = buildService.buglyId();
//         初始化Bugly
        CrashReport.initCrashReport(context, buglyId, false, strategy);

//        CrashReport.initCrashReport(context, buildService.buglyAppId(), buildService.debuggable(), strategy);

        sInit = true;

    }

    /**
     * 获取进程号对应的进程名
     *
     * @param pid 进程号
     * @return 进程名
     */
    private static String getProcessName(int pid) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("/proc/" + pid + "/cmdline"));
            String processName = reader.readLine();
            if (!TextUtils.isEmpty(processName)) {
                processName = processName.trim();
            }
            return processName;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
        return null;
    }
}
