package java_01_associate.chapter_9_thread;

import java.util.Random;

public class Producator extends Thread {

    private Random r = new Random();

    public Producator(String name) {
        super(name);
    }

    @Override public void run() {
        try {
            while (true) {
                synchronized (Exemplu3.list) {
                    if (Exemplu3.list.size() <= 100) {
                        int x = r.nextInt();
                        Exemplu3.list.add(x);
                        Exemplu3.list.notifyAll();
                        System.out.println("Am adaugat elementul " + x);
                    } else {
                        Exemplu3.list.wait();
                    }
                }
            }
        } catch (InterruptedException e) {

        }

    }

    public synchronized void m() {

    }

    /*

     */
}
