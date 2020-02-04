package java_professional.chapter_02_nio2;

import java.io.File;
import java.nio.file.Path;

public class Exemplu3 {
    public static void main(String[] args) {
        File file = new File("A/x.txt");
        file.delete();
    }
}
