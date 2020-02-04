package java_professional.chapter_02_nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplu14 {
    public static void main(String[] args) {
        Path p1 = Paths.get("Exemplu14.java");
        Path p2 = Paths.get("alt_fisier.txt");
        try {
            Files.copy(p1, p2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
