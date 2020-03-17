package java_01_professional.chapter_03_streams;

import java.util.Locale;
import java.util.ResourceBundle;

public class Exemplu18 {
    public static void main(String[] args) {
        Locale loc = new Locale("ro", "RO");

        ResourceBundle resourceBundle = ResourceBundle.getBundle("exemplu", loc);

        String hello = resourceBundle.getString("txtHello");
    }
}
