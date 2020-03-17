package java_01_associate.chapter_08_tipuri_generice_si_colecti;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Exemplu5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(120);
        list.add(13);
        list.add(11);
        list.add(12);
        list.add(16);
        list.add(12);
        list.add(14);

        Predicate<Integer> p1 = e -> e % 2 == 0;

        list.stream().
                filter(p1).
                    forEach(System.out::println);


    }
}
