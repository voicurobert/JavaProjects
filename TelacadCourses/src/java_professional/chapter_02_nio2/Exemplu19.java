package java_professional.chapter_02_nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplu19 {
    public static void main(String[] args) {
        Path p = Paths.get("Exemplu19.java");
        try {
            Files.lines(p).filter(s -> !s.trim().isEmpty()).filter(s -> s.length() % 2 == 0)
                 .map(s -> new StringBuilder(s).reverse()).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
