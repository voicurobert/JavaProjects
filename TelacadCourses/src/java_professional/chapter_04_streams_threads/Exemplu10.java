package java_professional.chapter_04_streams_threads;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exemplu10 {
    public static void main(String[] args) {
        List<Produs> list = Arrays.asList(new Produs(10, "a"), new Produs(20, "b"), new Produs(33, "c"));

        Map<Integer, List<Produs>> map = list.stream().collect(Collectors.groupingBy(produs -> produs.pret));
        System.out.println(map);
    }
}
