package java_01_professional.chapter_01_io_streams;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Exemplu10 {
    public static void main(String[] args) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:/c"))) {
            C c = new C();
            objectOutputStream.writeObject(c);
        } catch (Exception c) {

        }
    }
}
