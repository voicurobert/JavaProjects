package java_associate.chapter_03_structuri_de_control_si_orientare_pe_obiect2;

public class Foo {

    void transferPrinValoare(int x) {
        x = 10;
        System.out.println("x=" + x);
    }

    void transferPrinReferinta(Punct p) {
        p.x = 10;
        System.out.println("x=" + p.x);
    }
}
