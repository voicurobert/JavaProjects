package java_associate.chapter_03_structuri_de_control_si_orientare_pe_obiect2;

public class Exemplu7 {
    public static void main(String[] args) {
        Punct[] p1 = new Punct[5];

        for (int i = 0; i < p1.length; i++) {
            p1[i] = new Punct();
        }

        for (Punct a : p1) {
            a.x = 10;
            a.y = 5;
        }

        for (int i = 0; i < p1.length; i++) {
            System.out.println(p1[i].x + " " + p1[i].y);
        }

    }
}
