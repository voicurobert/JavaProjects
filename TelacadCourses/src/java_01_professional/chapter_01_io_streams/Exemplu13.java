package java_01_professional.chapter_01_io_streams;

import java.io.File;
import java.io.IOException;

public class Exemplu13 {
    public static void main(String[] args) {
        File file = new File("D:/file");
        try {
            file.createNewFile();
            System.out.println("is file " + file.isFile());
        } catch (IOException e) {

        }
    }
}
