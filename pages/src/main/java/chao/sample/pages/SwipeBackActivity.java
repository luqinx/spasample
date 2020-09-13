package chao.sample.pages;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import chao.android.tools.servicepool.Spa;
import chao.java.tools.servicepool.annotation.Service;
import chao.sample.interfaces.routeapis.RouteService;
import chao.sample.interfaces.thirdparty.SwipeBackService;

/**
 * @author luqin
 * @since 2020/9/13
 */
@Service(path = RouteService.swipeBack)
public class SwipeBackActivity extends AppCompatActivity {

    private SwipeBackService swipeBackService;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.swipe_back_page);
        swipeBackService = Spa.getService(SwipeBackService.class);
        swipeBackService.init(this);
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onBackPressed() {
        // 正在滑动返回的时候取消返回按钮事件
        if (swipeBackService.isSliding()) {
            return;
        }
        swipeBackService.backward();

    }
}
