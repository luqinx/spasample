package chao.sample.interfaces.routeapis;

import android.content.Context;

import chao.android.tools.router.annotation.Route;
import chao.java.tools.servicepool.IService;

/**
 * @author luqin
 * @since 2020/9/13
 */
public interface RouteService extends RoutePath,IService {
    @Route(path = swipeBack)
    void showSwipeBack(Context context);

    @Route(path = buildInfo)
    void showBuildInfo(Context context);
}
