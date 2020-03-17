package java_01_associate.chapter_08_tipuri_generice_si_colecti;

public class Exemplu3 {
    public static void main(String[] args) {
        D<Integer, ? extends Number> d1;
        d1 = new D<Integer, Double>();

    }
}
