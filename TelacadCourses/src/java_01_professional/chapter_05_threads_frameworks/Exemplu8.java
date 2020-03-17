package java_01_professional.chapter_05_threads_frameworks;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class Exemplu8 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 4, 5, 6, 7);
        SquareAction action = new SquareAction(list);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(action);

    }
}
