package java_associate.chapter_9_thread;

public class Exemplu2 {

    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        Thread x = new Thread(Exemplu2::collectDataFromDB1);

        Thread y = new Thread(() -> collectDataFromDB2());

        x.start();
        y.start();
        try {
            x.join();
            y.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);
    }

    public static void collectDataFromDB1() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void collectDataFromDB2() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
