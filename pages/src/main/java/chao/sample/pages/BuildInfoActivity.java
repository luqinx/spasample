package chao.sample.pages;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import chao.android.tools.servicepool.Spa;
import chao.java.tools.servicepool.annotation.Service;
import chao.sample.interfaces.routeapis.RouteService;
import chao.sample.interfaces.thirdparty.BuildService;
import chao.sample.pages.databinding.*;

/**
 * @author luqin
 * @since 2020/9/13
 */
@Service(path = RouteService.buildInfo)
public class BuildInfoActivity extends SwipeBackActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BuildInfoPageBinding viewBinding = BuildInfoPageBinding.inflate(LayoutInflater.from(this));
        setContentView(viewBinding.getRoot());

        BuildService buildService = Spa.getService(BuildService.class);
        viewBinding.applicationId.setText("applicationId: " + buildService.applicationId());
        viewBinding.versionName.setText("versionName: " + buildService.versionName());
        viewBinding.versionCode.setText("versionCode: " + buildService.versionCode() + "");
        viewBinding.buildType.setText("buildType: " + buildService.buildType());
        viewBinding.debuggable.setText("debuggable: " + buildService.debuggable());
        viewBinding.buglyId.setText("buglyId:" + buildService.buglyId());
    }
}
