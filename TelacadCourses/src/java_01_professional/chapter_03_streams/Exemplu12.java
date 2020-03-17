package java_01_professional.chapter_03_streams;

import java.time.LocalDate;
import java.time.Month;

public class Exemplu12 {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(2017, 10, 20);
        LocalDate d3 = LocalDate.of(2017, Month.NOVEMBER, 20);

        System.out.println(d1);
        System.out.println(d2);

    }
}
