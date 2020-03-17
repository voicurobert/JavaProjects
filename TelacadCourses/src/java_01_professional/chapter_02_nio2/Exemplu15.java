package java_01_professional.chapter_02_nio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Exemplu15 {
    public static void main(String[] args) {
        Path p = Paths.get("Exemplu15");
        try (BufferedReader in = Files.newBufferedReader(p)) {
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        Path p2 = Paths.get("Exemplu15");
        try {
            List<String> lines = Files.readAllLines(p2);
            lines.forEach(System.out::println);
        } catch (IOException e) {

        }
    }
}
