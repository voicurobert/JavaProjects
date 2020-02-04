package java_professional.chapter_05_threads_frameworks;

import java.util.concurrent.ForkJoinPool;

public class Exemplu6 {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        FibboTask task = new FibboTask(80);
        Integer rez = pool.invoke(task);
        System.out.println(rez);
    }
}
