package java_01_professional.chapter_03_streams;

import java.time.Duration;
import java.time.Period;

public class Exemplu16 {
    public static void main(String[] args) {
        Duration d = Duration.ofMinutes(10);

        Period p = Period.ofYears(5);

        System.out.println(d);
        System.out.println(p);

    }
}
