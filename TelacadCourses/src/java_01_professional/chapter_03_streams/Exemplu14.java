package java_01_professional.chapter_03_streams;

import java.time.ZoneId;

public class Exemplu14 {
    public static void main(String[] args) {
        ZoneId.getAvailableZoneIds().stream().filter(s -> s.contains("Europe")).forEach(System.out::println);
    }
}
