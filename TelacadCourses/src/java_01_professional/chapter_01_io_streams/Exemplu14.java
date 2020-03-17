package java_01_professional.chapter_01_io_streams;

import java.io.File;

public class Exemplu14 {
    public static void main(String[] args) {
        File file = new File("D:/file");
        boolean b = file.delete();
        System.out.println("Deleted " + b);
    }
}
