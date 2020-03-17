package java_01_professional.chapter_01_io_streams;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Exemplu3 {
    public static void main(String[] args) {
        try (PrintStream out = new PrintStream("D:/test1")) {
            out.println("HAHA");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
