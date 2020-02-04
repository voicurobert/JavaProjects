package java_professional.chapter_01_io_streams;

import java.io.File;

public class Exemplu12 {
    public static void main(String[] args) {
        File file = new File("D:/folder1");
        file.mkdir();

        boolean b1 = file.exists();
        if (b1) {
            System.out.println("File exists");
        } else {
            System.out.println("Does not exist");
        }

    }
}
