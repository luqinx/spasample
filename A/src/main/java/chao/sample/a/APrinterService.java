package chao.sample.a;

import chao.java.tools.servicepool.annotation.Service;
import chao.sample.interfaces.IPrinterService;

/**
 * @author luqin
 * @since 2020/9/5
 */
@Service(priority = 1)
public class APrinterService implements IPrinterService {
    @Override
    public void print() {
        System.out.println("this is a printer service.");
    }
}
