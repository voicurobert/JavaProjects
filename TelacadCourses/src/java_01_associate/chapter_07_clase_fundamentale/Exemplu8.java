package java_01_associate.chapter_07_clase_fundamentale;


import java.util.Scanner;

public class Exemplu8 {
    public static void main(String[] args) {
        System.out.println("Da un sir de caracter");
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        StringBuilder sb = new StringBuilder(line);
        System.out.println(sb.reverse());
    }
}
