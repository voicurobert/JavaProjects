package java_professional.chapter_03_streams;

import java.util.Random;
import java.util.stream.Stream;

public class Exemplu5 {
    public static void main(String[] args) {
        Random r = new Random();
        Stream.generate(() -> r.nextInt(1000) + 1).limit(10).forEach(System.out::println);
    }
}
