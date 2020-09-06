package chao.sample.a;

import chao.sample.interfaces.IPrinter;

public class APrinter implements IPrinter {
    @Override
    public void print() {
        System.out.println("this is A");
    }
}