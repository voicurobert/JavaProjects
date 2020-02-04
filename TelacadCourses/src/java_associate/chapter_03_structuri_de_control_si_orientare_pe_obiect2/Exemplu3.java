package java_associate.chapter_03_structuri_de_control_si_orientare_pe_obiect2;

public class Exemplu3 {
    public static void main(String[] args) {
        Punct p1 = new Punct();
        Punct p2 = new Punct();

        p1.z = 10;
        p2.z = 20;
        Punct.z = 70;

        System.out.println(p1.z);
        System.out.println(p2.z);
        System.out.println(Punct.z);
    }
}
