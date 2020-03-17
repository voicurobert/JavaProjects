package java_01_professional.chapter_02_nio2;

import java.io.File;

public class Exemplu2 {
    public static void main(String[] args) {
        try {
            File file = new File("A/x.txt");
            file.createNewFile();
        } catch (Exception e) {

        }

    }
}
