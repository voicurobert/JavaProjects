package java_01_associate.chapter_08_tipuri_generice_si_colecti;

import java.util.ArrayList;
import java.util.List;

public class Exemplu4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); // list = array list si nu arraylist = arraylist
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(5);

        // parcurgere cu lambda
        list.forEach(e -> System.out.println(e));
        list.forEach(System.out::println);
    }
}
