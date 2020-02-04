package java_associate.chapter_9_thread;

public class Consumator extends Thread {

    public Consumator(String name) {
        super(name);
    }

    @Override public void run() {
        while (true) {
            synchronized (Exemplu3.list) {
                if (!Exemplu3.list.isEmpty()) {
                    int x = Exemplu3.list.get(0);
                    Exemplu3.list.remove(0);
                    System.out.println("A fost eliminat elementul " + x);
                }
            }

        }
    }
}
