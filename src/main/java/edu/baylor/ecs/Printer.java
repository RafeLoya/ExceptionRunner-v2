package edu.baylor.ecs;

public class Printer {
    private int currID = 1;
    public synchronized void print(MyThread t) {
        //System.out.println(t.ID);
        while(t.getID() != currID) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread #" + t.getID());
        currID++;
        notifyAll();
    }
}
