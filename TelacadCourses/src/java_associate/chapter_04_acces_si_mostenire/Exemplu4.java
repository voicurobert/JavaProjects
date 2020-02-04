package java_associate.chapter_04_acces_si_mostenire;

public class Exemplu4 {

    public static void main(String[] args) {
        Bar b1 = new Bar();
        Foo f1 = new Foo();

        Bar a = new Foo();
        a.x = 10;
        // a.y = 10;
        a.m1();
        System.out.println(a.w);
    }

}
