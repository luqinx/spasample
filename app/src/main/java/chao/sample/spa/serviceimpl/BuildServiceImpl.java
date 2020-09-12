package chao.sample.spa.serviceimpl;

import chao.android.tools.servicepool.Spa;
import chao.java.tools.servicepool.annotation.Service;
import chao.sample.interfaces.thirdparty.BuildService;
import chao.sample.spa.BuildConfig;

/**
 * @author luqin
 * @since 2020/9/12
 */
@SuppressWarnings("unused")
@Service(scope = Spa.Scope.GLOBAL, disableIntercept = true)
public class BuildServiceImpl implements BuildService {
    @Override
    public String buglyId() {
        return BuildConfig.BUGLY_ID;
    }

    @Override
    public boolean debuggable() {
        return BuildConfig.DEBUG;
    }

    @Override
    public String versionName() {
        return BuildConfig.VERSION_NAME;
    }

    @Override
    public int versionCode() {
        return BuildConfig.VERSION_CODE;
    }

    @Override
    public String applicationId() {
        return BuildConfig.APPLICATION_ID;
    }

    @Override
    public String buildType() {
        return BuildConfig.BUILD_TYPE;
    }
}
