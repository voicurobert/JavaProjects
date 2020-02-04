package java_associate.chapter_08_tipuri_generice_si_colecti;

import java.util.Comparator;
import java.util.TreeSet;

public class Exemplu12 {

    public static void main(String[] args) {

        Comparator<Pisica> comparator = new Comparator<Pisica>() {
            @Override public int compare(Pisica o1, Pisica o2) {
                return o1.nume.compareTo(o2.nume);
            }
        };

        TreeSet<Pisica> set = new TreeSet<>((p1, p2) -> p1.nume.compareTo(p2.nume)); // Java 8 expresie lambda

        set.add(new Pisica("Tom", 2));
        set.add(new Pisica("A", 5));
        set.add(new Pisica("x", 5));

        set.forEach(e -> System.out.println(e));
    }

}
