package java_professional.chapter_04_streams_threads;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exemplu9 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aaa", "bbb", "c", "cc", "dd", "e", "d");

        Map<Integer, List<String>> map = list.stream().collect(Collectors.groupingBy(s -> s.length()));

        System.out.println(map);
    }
}
