package java_professional.chapter_02_nio2;

import java.util.Arrays;
import java.util.List;

public class Exemplu18 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 4, 8, 10, 11);
        int suma = list.stream().filter(integer -> integer % 2 == 1).reduce(0, Integer::sum);
        //.reduce( 0, ( a, b ) -> a + b );
    }
}
