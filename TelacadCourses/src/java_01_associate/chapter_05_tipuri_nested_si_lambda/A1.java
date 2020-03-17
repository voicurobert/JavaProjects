package java_01_associate.chapter_05_tipuri_nested_si_lambda;

public class A1 {

    int x;
    private static int y;

    // clasa inner non static
    // daca x vine din clasa care este inner, x se poate folosi doar prin dereferentiat din clasa
    // A1 pentru A2 este outer
    public class A2 {
        int x;

        public void m1() {
            A1.this.x = 10; // este al clase A1

            this.x = 10; // este al clasei A2

        }

    }

    // clasa inner statica
    static class A3 {

        public void m2() {
            y = 10;
        }

    }

}
