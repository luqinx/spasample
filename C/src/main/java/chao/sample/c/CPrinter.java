package chao.sample.c;

import chao.sample.interfaces.IPrinter;

public class CPrinter implements IPrinter {
    @Override
    public void print() {
        System.out.println("this is C");
    }
}