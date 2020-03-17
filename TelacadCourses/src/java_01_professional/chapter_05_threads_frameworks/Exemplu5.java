package java_01_professional.chapter_05_threads_frameworks;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Exemplu5 {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

        Runnable r = () -> System.out.println("hello - " + LocalDateTime.now());

        //scheduledExecutorService.schedule( r, 5, TimeUnit.SECONDS );

        //scheduledExecutorService.scheduleAtFixedRate( r, 1, 3, TimeUnit.SECONDS );

        scheduledExecutorService.scheduleWithFixedDelay(r, 1, 3, TimeUnit.SECONDS);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        scheduledExecutorService.shutdown();
    }
}
