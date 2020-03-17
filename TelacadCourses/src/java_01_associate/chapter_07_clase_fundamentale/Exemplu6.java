package java_01_associate.chapter_07_clase_fundamentale;

import java.util.*;

public class Exemplu6 {

    public static void main(String[] args) {
        Random r = new Random();

        int x = r.nextInt();
        int y = r.nextInt(1000);
        double z = r.nextDouble();
        boolean b = r.nextBoolean();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(b);
    }

}
