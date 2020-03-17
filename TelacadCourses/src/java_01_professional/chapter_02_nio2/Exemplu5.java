package java_01_professional.chapter_02_nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplu5 {
    public static void main(String[] args) {
        Path p1 = Paths.get("A/B");
        Path p2 = Paths.get("A", "B", "C");
    }
}
