package java_01_associate.chapter_08_tipuri_generice_si_colecti;

public class A<T> {
    T x;

    public A() {

    }

    public A(T x) {
        this.x = x;
    }

    public T m1() {
        return x;
    }

    public void m2(T a) {

    }


    public static <Q> void m3(Q a) {

    }
}
