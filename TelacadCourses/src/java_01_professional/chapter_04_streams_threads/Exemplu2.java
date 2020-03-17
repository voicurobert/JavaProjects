package java_01_professional.chapter_04_streams_threads;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplu2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 5, 6);

        List<Integer> listPow = list.stream().map(integer -> integer * integer).collect(Collectors.toList());
        System.out.println(listPow);


    }
}
