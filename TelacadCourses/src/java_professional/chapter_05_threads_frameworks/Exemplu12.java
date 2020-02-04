package java_professional.chapter_05_threads_frameworks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exemplu12 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 5, 2, 4);

        List<Integer> syncList = Collections.synchronizedList(list);

    }
}
