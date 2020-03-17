package java_01_associate.chapter_08_tipuri_generice_si_colecti;

public class Exemplu2 {
    public static void main(String[] args) {
        C<Integer> c1 = new C<>();
        // nu merge C< String > c2 = new C<>();
        C<?> c2 = new C<>(); // ? va fi Number si nu Object!!!
    }
}
