package java_01_professional.chapter_03_streams;

import java.util.Locale;

public class Exemplu17 {
    public static void main(String[] args) {
        Locale l1 = new Locale("en");

        Locale l2 = new Locale("en", "US");

        Locale l3 = new Locale.Builder().setLanguage("en").setRegion("US").build();

        Locale l4 = Locale.GERMANY;


    }
}
