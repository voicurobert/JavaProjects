package java_associate.chapter_06_exceptii_si_erori;

public class Exemplu1 {

    public static void main(String[] args) {

        Predicat p1 = x -> false;
        Predicat p2 = (x) -> false;
        Predicat p3 = (int x) -> false;

        Functie f1 = (x, y) -> 10;
        Functie f2 = (x, y) -> x + y;
        Functie f3 = (int x, int y) -> {
            return x + y;
        };

        m((x, y) -> x + y, 10, 20);
        m((x, y) -> x * y, 10, 20);
    }

    public static void m(Functie f, int a, int b) {
        System.out.println(f.operatie(a, b));
    }

}
