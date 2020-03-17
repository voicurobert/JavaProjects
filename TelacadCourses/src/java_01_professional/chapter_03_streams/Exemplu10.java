package java_01_professional.chapter_03_streams;

import java.util.Arrays;
import java.util.List;

public class Exemplu10 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("mama", "ccc", "curs");

        long nr = list.stream().map(s -> s.split("\\s*")).flatMap(q -> Arrays.stream(q))
                      .filter(s -> "aeiou".contains(s.toLowerCase())).count();
    }
}
