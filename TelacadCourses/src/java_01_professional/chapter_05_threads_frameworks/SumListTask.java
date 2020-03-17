package java_01_professional.chapter_05_threads_frameworks;

import java.util.List;
import java.util.concurrent.RecursiveTask;

public class SumListTask extends RecursiveTask<Integer> {

    private List<Integer> list;

    public SumListTask(List<Integer> list) {
        this.list = list;
    }

    @Override protected Integer compute() {
        if (list.size() < 3) {
            return list.stream().reduce(0, (integer, integer2) -> integer + integer2);
        }

        int mid = list.size() / 2;

        SumListTask t1 = new SumListTask(list.subList(0, mid));
        SumListTask t2 = new SumListTask(list.subList(mid, list.size()));

        t1.fork();

        return t2.compute() + t1.join();
    }
}
