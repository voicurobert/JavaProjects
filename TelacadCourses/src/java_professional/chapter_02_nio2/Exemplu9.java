package java_professional.chapter_02_nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplu9 {
    public static void main(String[] args) {
        Path p1 = Paths.get("A/B");
        Path p2 = Paths.get("C/D");
        Path res = p1.resolve(p2);
        System.out.println(res);
    }
}
