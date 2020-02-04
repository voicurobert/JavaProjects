package java_professional.chapter_02_nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplu13 {
    public static void main(String[] args) {
        Path p1 = Paths.get("exempluFolder");
        try {
            if (Files.exists(p1)) {
                Files.delete(p1);
            }
            //Files.deleteIfExists( p1 );
        } catch (IOException e) {

        }
    }
}
