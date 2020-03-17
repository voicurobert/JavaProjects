package java_01_associate.chapter_05_tipuri_nested_si_lambda;

public class Exemplu6 {

    public static void main(String[] args) {

        Predicat p1 = (x) -> x > 5;

        Predicat p2 = x -> x > 5;

        Predicat p3 = (int x) -> x > 5;

        Predicat p4 = x -> { return x > 5; };
        System.out.println(p1.regula(6));
    }

}
