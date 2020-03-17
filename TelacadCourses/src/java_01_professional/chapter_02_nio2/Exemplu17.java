package java_01_professional.chapter_02_nio2;

import java.util.Arrays;
import java.util.List;

public class Exemplu17 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello", "John");
        list.stream().filter(s -> s.length() % 2 == 0).map(s -> s.length() * 2).forEach(System.out::println);
    }
}
