package java_professional.chapter_03_streams;

public class Exemplu2 {
    public static void main(String[] args) {
        Predicat p1 = x -> x % 2 == 0;
        System.out.println(p1.test(10)); // true

        Predicat p2 = x -> {
            System.out.println("BAU");
            return x % 2 == 0;
        };

        Predicat p3 = x -> myTest(x);
        Predicat p4 = Exemplu2::myTest;


    }

    private static boolean myTest(int x) {
        System.out.println("BAU");
        return x % 2 == 0;
    }
}
