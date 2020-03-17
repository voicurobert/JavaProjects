package java_01_professional.chapter_02_nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplu12 {
    public static void main(String[] args) {
        Path p1 = Paths.get("exempluFile");
        Path p2 = Paths.get("exempluFolder");
        try {
            Files.createFile(p1);
            Files.createDirectory(p2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
