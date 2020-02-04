package java_professional.chapter_05_threads_frameworks;

import java.util.concurrent.Semaphore;

public class Exemplu10 {

    private Semaphore s = new Semaphore(5);

    private int x;

    public void increment() throws InterruptedException {
        s.acquire();
        try {
            x++;
        } finally {
            // trebuie sa fie neaparat pe finally
            s.release();
        }
    }

    public void afisare() throws InterruptedException {
        s.acquire();
        System.out.println(x);
        s.release();
    }
}
