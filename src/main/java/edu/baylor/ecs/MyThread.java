package edu.baylor.ecs;

public class MyThread extends Thread {
    private int ID;
    private Printer printer;

    public MyThread(Printer p, int i ) {
        ID = i;
        printer = p;
    }

    public synchronized int getID() { return ID; }
    public void run() {
        printer.print(this);
    }
}
