package java_01_professional.chapter_04_streams_threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplu4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 5, 6);

        ArrayList<Integer> listPow = list.stream().map(integer -> integer * integer)
                                         .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(listPow);
    }
}
