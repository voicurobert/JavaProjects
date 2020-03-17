package java_01_professional.chapter_02_nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplu20 {
    public static void main(String[] args) {
        Path p = Paths.get("./");
        try {
            // list ia numai ce e in folderul curent
            // walk se duce in adancime

            Files.list(p).filter(path -> path.toString().endsWith(".java"))
                 .filter(path -> path.getFileName().toString().length() % 2 == 0).forEach(System.out::println);

            Files.walk(p, 10).filter(path -> path.toString().endsWith(".java"))
                 .filter(path -> path.getFileName().toString().length() % 2 == 0).forEach(System.out::println);

        } catch (IOException e) {

        }
    }
}
