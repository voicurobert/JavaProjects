package java_professional.chapter_03_streams;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exemplu15 {
    public static void main(String[] args) {
        ZonedDateTime t1 = ZonedDateTime.now();
        ZonedDateTime t2 = ZonedDateTime.now(ZoneId.of("Europe/London"));

        ZonedDateTime zd3 = t1.plusHours(17);

    }
}
