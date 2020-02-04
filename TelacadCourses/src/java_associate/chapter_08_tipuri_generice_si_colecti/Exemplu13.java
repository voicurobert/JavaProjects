package java_associate.chapter_08_tipuri_generice_si_colecti;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exemplu13 {

    // map - cheie valoare. cheile sunt intotdeaua unice
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");

        Set<Integer> keys = map.keySet();
        for (Integer k : keys) {
            System.out.println(" " + k + map.get(k));
        }

        map.forEach((k, v) -> System.out.println(k + " " + v)); // biconsumer
    }
}
