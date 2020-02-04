package java_professional.chapter_01_io_streams;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Exemplu11 {
    public static void main(String[] args) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("D:/C"))) {
            C c = (C) inputStream.readObject();
        } catch (Exception e) {

        }
    }
}
