package java_professional.chapter_04_streams_threads;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exemplu12 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "bb", "a", "bbb", "bb", "f", "ggw");

        Map<Boolean, List<String>> map = list.stream().collect(Collectors.partitioningBy(s -> s.length() % 2 == 0));
        System.out.println(map);
    }
}
