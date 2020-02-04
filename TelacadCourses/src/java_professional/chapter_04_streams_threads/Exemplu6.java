package java_professional.chapter_04_streams_threads;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplu6 {

    public static void main(String[] args) {
        List<Produs> produses = Arrays.asList(new Produs(10, "aa"), new Produs(20, "bbb"));

        double ab = produses.stream().collect(Collectors.averagingInt(value -> value.pret));
        System.out.println(ab);
    }

}
