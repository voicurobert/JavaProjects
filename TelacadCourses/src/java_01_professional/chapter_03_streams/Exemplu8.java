package java_01_professional.chapter_03_streams;

import java.util.Arrays;
import java.util.List;

public class Exemplu8 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
        long c = list.stream().filter(s -> s.length() % 2 == 0).count();
    }
}
