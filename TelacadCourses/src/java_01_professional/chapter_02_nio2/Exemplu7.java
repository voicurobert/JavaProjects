package java_01_professional.chapter_02_nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplu7 {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:/A/B/C");
        for (int i = 0; i < p1.getNameCount(); i++) {
            System.out.println(p1.getName(i));
        }
    }
}
