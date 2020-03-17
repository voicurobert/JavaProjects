package java_01_associate.chapter_9_thread;


import java.util.ArrayList;
import java.util.List;

public class Exemplu3 {

    public static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        new Producator("P1").start();
        new Producator("P2").start();
        new Producator("P3").start();

        new Consumator("C1").start();
        new Consumator("C2").start();
        new Consumator("C3").start();


    }

}
