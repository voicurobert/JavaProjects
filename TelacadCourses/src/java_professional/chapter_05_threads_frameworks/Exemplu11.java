package java_professional.chapter_05_threads_frameworks;


import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Exemplu11 {
    private ReadWriteLock s = new ReentrantReadWriteLock();

    private int x;

    public void increment() throws InterruptedException {
        s.writeLock().lock();
        try {
            x++;
        } finally {
            // trebuie sa fie neaparat pe finally
            s.writeLock().unlock();
        }
    }

    public void afisare() throws InterruptedException {
        s.readLock().lock();
        System.out.println(x);
        s.readLock().unlock();
    }
}
