package java_01_professional.chapter_03_streams;

import java.util.stream.Stream;

public class Exemplu4 {
    public static void main(String[] args) {
        // finit
        Stream<Integer> s1 = Stream.empty();

        // finit
        Stream<Integer> s2 = Stream.of(3, 5, 6, 2, 6, 78);

        // infinit
        Stream<Integer> s3 = Stream.iterate(1, integer -> integer + 2);

        // stream infinit
        Stream<Integer> s4 = Stream.generate(() -> 1);

        // parcurgere stream infinit
        s3.limit(10).forEach(System.out::println);


    }
}
