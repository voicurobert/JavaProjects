package java_01_associate.chapter_08_tipuri_generice_si_colecti;

import java.util.HashSet;
import java.util.Set;

public class Exemplu9 {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(4);
        set.remove(3);
    }

}

