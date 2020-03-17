package java_01_associate.chapter_02_structuri_de_control_si_orientare_pe_obiect;

public class Exemplu7 {

    public static void main(String[] args) {
        Pisica p1;
        p1 = new Pisica("tom", 3, "gri");
        Pisica p2;
        p2 = p1;

        Pisica p3 = new Pisica("Leo", 7, "alb");

        p1.nume = "Tom";
        p1.varsta = 1;
        p1.culoare = "gri";

        System.out.println(p1.nume);
        System.out.println(p2.nume);
        System.out.println(p3.nume);
    }
}
