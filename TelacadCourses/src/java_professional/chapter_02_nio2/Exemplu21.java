package java_professional.chapter_02_nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplu21 {
    public static void main(String[] args) {
        Path p = Paths.get("./");
        try {
            Files.find(p, 10, (path, basicFileAttributes) -> basicFileAttributes.size() > 1000)
                 .forEach(System.out::println);
        } catch (IOException e) {

        }
    }
}
