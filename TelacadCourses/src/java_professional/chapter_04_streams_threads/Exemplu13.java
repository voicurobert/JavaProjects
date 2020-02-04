package java_professional.chapter_04_streams_threads;

import java.util.Optional;

public class Exemplu13 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.empty();
        Optional<String> o2 = Optional.of("aaa");
        Optional<String> o3 = Optional.ofNullable("bla");

        System.out.println(o1.isPresent());
        o1.ifPresent(System.out::println);

        o2.filter(s -> s.length() % 2 == 0).ifPresent(System.out::println);
        o2.map(s -> s.length()).ifPresent(System.out::println);

        String other = o2.orElse("Hello");

    }
}
