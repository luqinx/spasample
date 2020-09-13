package chao.sample.spa;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import chao.android.tools.router.SpRouter;
import chao.android.tools.servicepool.Spa;
import chao.sample.interfaces.IPrinterService;
import chao.sample.interfaces.routeapis.RouteService;

/**
 * @author luqin
 * @since 2020/9/5
 */
public class MainActivity extends AppCompatActivity {

    private final DebugItem[] items = {
        new DebugItem("printer", () -> {
            IPrinterService printer = Spa.getService(IPrinterService.class);
            printer.print();
//        Spa.getService(BPrinterService.class).print();
            Spa.getService(IPrinterService.class).print();

        }),
            new DebugItem("swipe back", () -> {
                SpRouter.getService(RouteService.class).showSwipeBack(MainActivity.this);
            }),
            new DebugItem("build Info", () -> SpRouter.getService(RouteService.class).showBuildInfo(MainActivity.this))
    };


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        RecyclerView recyclerView = findViewById(R.id.recycle_view);
        recyclerView.setAdapter(new Adapter());
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
    }

    private static class DebugItem {
        private String title;
        private Action action;

        public DebugItem(String title, Action action) {
            this.title = title;
            this.action = action;
        }
    }

    private interface Action {
        void action();
    }

    private class Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(MainActivity.this).inflate(R.layout.main_item, parent, false);
            return new RecyclerView.ViewHolder(itemView) {};
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
            TextView titleView = holder.itemView.findViewById(R.id.title);
            titleView.setText(items[position].title);
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    items[position].action.action();
                }
            });
        }

        @Override
        public int getItemCount() {
            return items.length;
        }
    }
}
