package java_01_professional.chapter_01_io_streams;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Exemplu8 {
    public static void main(String[] args) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(
                "D:/produse"); ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);) {
            List<Produs> produses = new ArrayList<>();
            produses.add(new Produs("A", 41));
            produses.add(new Produs("B", 41));
            produses.add(new Produs("C", 42));
            produses.add(new Produs("D", 44));
            objectOutputStream.writeObject(produses);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
