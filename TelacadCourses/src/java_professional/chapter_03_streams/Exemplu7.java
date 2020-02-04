package java_professional.chapter_03_streams;

import java.util.Arrays;
import java.util.List;

public class Exemplu7 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");

        boolean b1 = list.stream().map(s -> s.length()).allMatch(s -> s % 2 == 0);

        boolean b2 = list.stream().map(s -> s.length()).anyMatch(s -> s % 2 == 0);

        boolean b3 = list.stream().map(s -> s.length()).noneMatch(s -> s % 2 == 0);
    }

}
