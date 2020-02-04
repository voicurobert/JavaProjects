package java_professional.chapter_05_threads_frameworks;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class Exemplu7 {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        List<Integer> list = Arrays.asList(2, 3, 4, 5, 5, 6, 7);
        SumListTask task = new SumListTask(Arrays.asList(2, 3, 4, 5, 5, 6, 7));

        Integer rez = pool.invoke(task);
        System.out.println(rez);
        System.out.println(list.stream().mapToInt(value -> value).sum());
    }
}
