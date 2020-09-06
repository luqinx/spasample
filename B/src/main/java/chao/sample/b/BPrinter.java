package chao.sample.b;

import chao.sample.interfaces.IPrinter;

public class BPrinter implements IPrinter {
    @Override
    public void print() {
        System.out.println("this is B");
    }
}