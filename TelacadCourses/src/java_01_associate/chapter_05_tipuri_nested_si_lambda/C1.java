package java_01_associate.chapter_05_tipuri_nested_si_lambda;

public class C1 {
    int x;
    static int y;

    public void m1() {
        class C2 {
            public void m2() {
                x = 10;
            }
        }
    }

    public static void m2() {
        int q = 10;
        class C3 {
            public void m3() {
                System.out.println(q); // q devine final!!!
                y = 10;
            }
        }
    }

}
