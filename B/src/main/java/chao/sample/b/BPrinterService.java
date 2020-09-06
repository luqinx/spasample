package chao.sample.b;

import chao.java.tools.servicepool.annotation.Service;
import chao.sample.interfaces.IPrinterService;

/**
 * @author luqin
 * @since 2020/9/5
 */
@Service(priority = 2)
public class BPrinterService implements IPrinterService {
    @Override
    public void print() {
        System.out.println("this is b printer service.");
    }
}
