package java_01_associate.chapter_07_clase_fundamentale;

import java.util.Scanner;

public class Exemplu7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Cum te cheama?");
        String line = s.nextLine();
        System.out.println("Salut, " + line + "!");

    }
}
