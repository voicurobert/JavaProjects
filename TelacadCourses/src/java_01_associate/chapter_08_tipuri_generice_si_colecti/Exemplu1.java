package java_01_associate.chapter_08_tipuri_generice_si_colecti;

public class Exemplu1 {
    public static void main(String[] args) {

        A a1;
        // standard ca sa se vada ca are tip generic. ? inseamna absenta oricarei constrangeri
        A<?> a2;

        A<Integer> a3;
        a3 = new A<Integer>();

        // extends inseamna orice referinta copil al lui Number
        A<? extends Number> a4;
        a4 = new A<Integer>();


        // super inseamna orice referinta parinte al lui Integer
        A<? super Integer> a5;
        a5 = new A<Number>();

        // Object este tipul de date implicit pentru tipuri generice
        new A();

        new A<Integer>();

        new A<int[]>();
    }
}
