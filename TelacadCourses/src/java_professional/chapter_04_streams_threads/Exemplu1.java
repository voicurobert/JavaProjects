package java_professional.chapter_04_streams_threads;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplu1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aaa", "bbb", "c", "d", "qqq");
        String res = list.stream().map(s -> String.valueOf(s.length())).collect(Collectors.joining(","));
        System.out.println(res);
    }
}
