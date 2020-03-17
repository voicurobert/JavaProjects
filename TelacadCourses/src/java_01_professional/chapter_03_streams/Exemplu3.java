package java_01_professional.chapter_03_streams;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Consumer<T>
 * BiConsumer<T,G>
 * Supplier<T>
 * Predicate<T>
 * BiPredicate<T,G>
 * Function<T,R>
 * BiFunction<T,G,R>
 * UnaryOperator<T>
 * BinaryOperator<T>
 */

public class Exemplu3 {
    public static void main(String[] args) {
        Consumer<String> c1 = s -> System.out.println(s);
        BiConsumer<Integer, String> c2 = (integer, s) -> System.out.println(integer + " " + s);
        Predicate<String> p1 = s -> s.length() % 2 == 0;
        Function<String, Integer> f1 = s -> s.length();

    }
}
