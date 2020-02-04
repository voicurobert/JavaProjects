package java_associate.chapter_08_tipuri_generice_si_colecti;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Exemplu15 {
    public static void main(String[] args) {
        LocalTime t1 = LocalTime.of(21, 40);
        LocalDate t2 = LocalDate.of(206, 8, 4);
        LocalDateTime t3 = LocalDateTime.of(t2, t1);
    }
}
