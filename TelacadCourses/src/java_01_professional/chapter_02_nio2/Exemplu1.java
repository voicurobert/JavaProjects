package java_01_professional.chapter_02_nio2;


import java.io.File;

public class Exemplu1 {
    public static void main(String[] args) {
        File file = new File("A");
        // cale absoluta - calea data in sistemul de fisierul prin specificarea la radacina /A/B/C
        // cale relativa - nu face referire la radacina A/B/C
        // ../ parinte
        // ./ ramanem unde suntem
        file.mkdir();
    }
}
