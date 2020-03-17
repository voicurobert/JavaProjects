package java_01_professional.chapter_05_threads_frameworks;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Exemplu4 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();

        Runnable r = () -> System.out.println("bla");

        Future<?> f = service.submit(r);
        service.shutdown();
        // alte operatii

        try {
            f.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
