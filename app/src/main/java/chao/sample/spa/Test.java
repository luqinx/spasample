package chao.sample.spa;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import chao.android.tools.servicepool.Spa;
import chao.sample.b.BPrinterService;
import chao.sample.interfaces.IPrinterService;

/**
 * @author luqin
 * @since 2020/9/5
 */
public class Test extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Spa.init(this);

        IPrinterService printer = Spa.getService(IPrinterService.class);
        printer.print();
//        Spa.getService(BPrinterService.class).print();
        Spa.getService(IPrinterService.class).print();
    }
}
