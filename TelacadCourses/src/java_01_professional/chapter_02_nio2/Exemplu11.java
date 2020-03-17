package java_01_professional.chapter_02_nio2;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplu11 {
    public static void main(String[] args) {
        Path p1 = Paths.get("A/B/C/./../.././X/Y/Z/../../Q/W/./E");
        System.out.println(p1.normalize());

        File f = p1.toFile();
        Path p3 = f.toPath();
    }
}
