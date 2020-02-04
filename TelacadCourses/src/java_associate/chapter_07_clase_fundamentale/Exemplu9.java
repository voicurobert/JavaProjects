package java_associate.chapter_07_clase_fundamentale;

import java.util.Random;
import java.util.Scanner;

public class Exemplu9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean numberWasRead = true;
        do {
            System.out.println("n:");
            String line = s.nextLine();

            try {
                Integer n = new Integer(line);
                Random r = new Random();
                for (int i = 0; i <= n; i++) {
                    int randomInt = r.nextInt(1000);
                    System.out.println("Un int aleator: " + randomInt);
                }
                numberWasRead = true;
            } catch (NumberFormatException e) {
                System.out.println("Trebuie sa introduceti un nr");
                numberWasRead = false;
            }
        } while (!numberWasRead);

    }
}
