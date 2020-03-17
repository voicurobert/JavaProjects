package java_01_professional.chapter_05_threads_frameworks;

import java.util.Arrays;
import java.util.List;

public class Exemplu9 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 34, 5, 6, 7, 3, 2);

        //list.stream().map( Exemplu9::doubleValue ).forEach( System.out::println );

        list.parallelStream().map(Exemplu9::doubleValue).forEach(System.out::println);
    }

    private static Integer doubleValue(Integer v) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }
        return v * 2;
    }
}
