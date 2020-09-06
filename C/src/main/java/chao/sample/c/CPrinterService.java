package chao.sample.c;

import chao.java.tools.servicepool.annotation.Service;
import chao.sample.interfaces.IPrinterService;

/**
 * @author luqin
 * @since 2020/9/5
 */
@Service(priority = 3)
public class CPrinterService implements IPrinterService {
    @Override
    public void print() {
        System.out.println("this is c printer service.");
    }
}
