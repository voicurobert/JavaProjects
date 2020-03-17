package java_01_professional.chapter_05_threads_frameworks;

import java.util.concurrent.*;

public class Exemplu3 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();

        Callable<Integer> callable = () -> 2 + 4;

        Future<Integer> f = service.submit(callable);

        // alte operatii
        service.shutdown();
        try {
            Integer v = f.get();
            System.out.println(v);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
