package java_professional.chapter_02_nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplu6 {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:/A/B");
        Path p2 = Paths.get("A/B");

        System.out.println(p1.getFileName());
        System.out.println(p1.getParent());
        System.out.println(p1.getRoot());

        System.out.println(p2.getFileName());
        System.out.println(p2.getParent());
        System.out.println(p2.getRoot());
    }
}
