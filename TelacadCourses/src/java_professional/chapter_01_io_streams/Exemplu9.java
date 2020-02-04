package java_professional.chapter_01_io_streams;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class Exemplu9 {
    public static void main(String[] args) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:/produse"))) {
            List<Produs> produses = (List<Produs>) objectInputStream.readObject();
            produses.forEach(produs -> System.out.println(produs.nume + " " + produs.pret));
        } catch (Exception e) {

        }
    }
}
