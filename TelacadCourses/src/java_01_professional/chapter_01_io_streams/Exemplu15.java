package java_01_professional.chapter_01_io_streams;

import java.io.File;
import java.util.Arrays;

public class Exemplu15 {
    public static void main(String[] args) {
        File file = new File("C:/");
        String[] files = file.list();
        File[] filesVecc = file.listFiles();
        Arrays.asList(files).forEach(System.out::println);
    }
}
