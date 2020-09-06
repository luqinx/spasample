package chao.sample.spa;

import org.junit.Test;

import java.util.ServiceLoader;

import chao.android.tools.servicepool.Spa;
import chao.sample.interfaces.IPrinter;
import chao.sample.interfaces.IPrinterService;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {

        //查找出所有IPrinter
        ServiceLoader<IPrinter> printers = ServiceLoader.load(IPrinter.class);
        for (IPrinter printer: printers) {
            //这里没有CPrinter,因为CPrinter没有定义在/META-INF/services/com.sample.interface.IPrinter里
            printer.print();
        }

        Spa.getService(IPrinterService.class);
    }

    public static void main(String[] args) {

        //查找出所有IPrinter
        ServiceLoader<IPrinter> printers = ServiceLoader.load(IPrinter.class);
        for (IPrinter printer: printers) {
            //这里没有CPrinter,因为CPrinter没有定义在/META-INF/services/com.sample.interface.IPrinter里
            printer.print();
        }
    }
}