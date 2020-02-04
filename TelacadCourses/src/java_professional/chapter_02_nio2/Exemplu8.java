package java_professional.chapter_02_nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplu8 {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:/A/b/C");
        Path sp = p1.subpath(0, 3);
        System.out.println(sp);
    }
}
