package java_01_associate.chapter_05_tipuri_nested_si_lambda;

public class Exemplu3 {

    public static void main(String[] args) {

        A1.A3 a3 = new A1.A3();

        A1 a1 = new A1();

        A1.A2 a2 = a1.new A2();
        System.out.println(a1.x);
        a2.m1();
        System.out.println(a1.x);
        Masina masina = new Masina();
        // orice masina are un motor, atunci cand motorul ruleaza masina se deplaseaza
        Masina.Motor m1 = masina.new Motor();
        m1.seDeplaseaza();
        Object o = new Object();

    }

}
