package java_professional.chapter_01_io_streams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Exemplu7 {
    public static void main(String[] args) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:/punct1"))) {
            Punct p = (Punct) objectInputStream.readObject();
            System.out.println(p.x + " " + p.y);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
