package java_associate.chapter_04_acces_si_mostenire;

public class Exemplu5 {
    public static void main(String[] args) {
        Forma f1 = new Dreptunghi();
        System.out.println(f1.getArie());


        Forma[] v = new Forma[5];
        v[0] = new Dreptunghi();
        v[1] = new Triunghi();

        Triunghi t1 = (Triunghi) v[1];

        if (v[1] instanceof Triunghi) {
            System.out.println("T");
        }
        if (v[1] instanceof Dreptunghi) {
            System.out.println("D");
        }
        if (v[1] instanceof Forma) {
            System.out.println("F");
        }
    }
}
