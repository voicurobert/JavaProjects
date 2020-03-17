package java_01_associate.chapter_9_thread;

public class EvenNumbersRunnable implements Runnable {

    @Override public void run() {
        for (int i = 0; i <= 20; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
                notifyAll();
            }
        }
    }
}
