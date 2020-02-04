package java_professional.chapter_01_io_streams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Exemplu6 {

    public static void main(String[] args) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:/punct1"))) {
            objectOutputStream.writeObject(new Punct(1, 5, 5));
        } catch (IOException e) {
            System.out.println("E");
        }
    }

}
