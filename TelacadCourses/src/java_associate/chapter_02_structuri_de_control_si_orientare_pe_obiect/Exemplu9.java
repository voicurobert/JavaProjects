package java_associate.chapter_02_structuri_de_control_si_orientare_pe_obiect;

public class Exemplu9 {

    public static void main(String[] args) {
        Punct p1 = new Punct(0, 1);
        Punct p2 = new Punct(1, 0);

        double r = p1.getDistance(p2);
        System.out.println(r);
    }
}
