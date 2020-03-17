package java_01_associate.chapter_06_exceptii_si_erori;

public class Exemplu2 {

    public static void main(String[] args) {

        Pisica p1 = Pisica.getInstance();
        p1.nume = "Tom";
        Pisica p2 = Pisica.getInstance();
        System.out.println(p2.nume);

        Punct punct = Punct.getInstance();

        // testeaza instantele
        System.out.println(punct.equals(Punct.getInstance()));
        // testeaza referintele
        System.out.println(punct == Punct.getInstance());
    }

}
