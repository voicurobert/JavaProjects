package java_professional.chapter_03_streams;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Exemplu13 {
    public static void main(String[] args) {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.of(2020, 10, 20, 10, 34);

        LocalDateTime dt3 = LocalDateTime.of(LocalDate.of(2020, Month.APRIL, 12), LocalTime.of(11, 11));

        System.out.println(dt3);

    }
}
