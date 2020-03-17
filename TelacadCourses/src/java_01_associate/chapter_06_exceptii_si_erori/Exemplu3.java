package java_01_associate.chapter_06_exceptii_si_erori;

public class Exemplu3 {

    public static void main(String[] args) {

        Pisica p = Pisica.getInstance();
        System.out.println(p.toString());
        Punct punct = Punct.getInstance();
        punct.x = 20;
        punct.y = 30;
        System.out.println(punct.toString());
    }

}
