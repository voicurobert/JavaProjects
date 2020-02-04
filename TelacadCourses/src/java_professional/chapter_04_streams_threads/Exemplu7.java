package java_professional.chapter_04_streams_threads;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exemplu7 {
    public static void main(String[] args) {
        List<Produs> produses = Arrays.asList(new Produs(10, "aa"), new Produs(20, "bbb"));

        Map<String, Integer> map = produses.stream().collect(Collectors.toMap(produs -> produs.nume, o -> o.pret));
        System.out.println(map);
    }
}
