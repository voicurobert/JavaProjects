package java_01_associate.chapter_03_structuri_de_control_si_orientare_pe_obiect2;

public class Exemplu1 {

    public static void main(String[] args) {
        Foo f1 = new Foo();
        int x = 40;
        Punct p1 = new Punct();
        p1.x = 40;

        f1.transferPrinValoare(x);
        System.out.println("exemplu1 x=" + x);
        f1.transferPrinReferinta(p1);
        System.out.println("exemplu1 p1.x=" + p1.x);

    }
}
