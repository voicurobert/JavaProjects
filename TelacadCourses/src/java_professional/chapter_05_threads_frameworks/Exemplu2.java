package java_professional.chapter_05_threads_frameworks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exemplu2 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        ExecutorService service2 = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        Runnable r1 = () -> System.out.println("hello");

        service.execute(r1);

        service.shutdown(); // asteapta ca task-urile sa se termine dupa care inchide service-ul

        //service.shutdownNow(); // nu se recomanda

    }
}
