package java_professional.chapter_05_threads_frameworks;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exemplu1 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();

        try {
            while (true) {
                Thread.sleep(300);
                service.execute(() -> adunare(3, 5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            service.shutdown();
        }
    }

    private static int adunare(int a, int b) {
        return a + b;
    }
}
