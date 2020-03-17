package java_01_professional.chapter_04_streams_threads;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exemplu16 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aaa", "bbb", "c", "cc", "dd", "e", "d");

        Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(map);
    }
}
