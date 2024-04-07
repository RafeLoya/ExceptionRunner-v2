package edu.baylor.ecs;

import java.util.ArrayList;
import java.util.List;

public class Module2 {
    public static void main(String[] args) {
        Printer p = new Printer();
        List<MyThread> threads = new ArrayList<>();

        for (int i = 0; i < 20; ++i) {
            threads.add(new MyThread(p, i + 1));
        }
        for(MyThread mt : threads) {
            mt.start();
        }
    }
}
