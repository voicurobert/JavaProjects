package java_01_professional.chapter_03_streams;

/*
LocalDate
LocalTime
LocalDateTime
ZonedDateTime

Duration
Period
 */

import java.time.LocalTime;

public class Exemplu11 {
    public static void main(String[] args) {
        LocalTime t1 = LocalTime.now();
        LocalTime t2 = LocalTime.of(10, 55);
        LocalTime t3 = LocalTime.of(10, 55, 20);

        System.out.println(t1);
        System.out.println(t2);

        LocalTime rez = t1.minusMinutes(10);
        LocalTime rez2 = t1.plusMinutes(10);

        if (t1.isAfter(t2)) {
            System.out.println("hello");
        } else {
            System.out.println("world");
        }
    }
}
