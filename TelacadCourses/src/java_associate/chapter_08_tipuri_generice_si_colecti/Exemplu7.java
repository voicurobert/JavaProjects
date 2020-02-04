package java_associate.chapter_08_tipuri_generice_si_colecti;

import java.util.LinkedList;

public class Exemplu7 {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(); // ne permite sa folosim stive sau cozi
        list.addLast(15);
        list.addFirst(5);
        list.addLast(15);
        list.addLast(3);
        list.addFirst(7);
        list.addLast(15);
        list.addLast(4);
        list.addLast(2);

        list.forEach(System.out::println);

    }

}
