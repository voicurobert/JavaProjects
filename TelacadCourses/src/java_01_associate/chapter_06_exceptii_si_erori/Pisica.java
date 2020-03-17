package java_01_associate.chapter_06_exceptii_si_erori;

public class Pisica {

    private static Pisica SINGLETON;

    String nume;
    int varsta;

    private Pisica() {

    }

    public static Pisica getInstance() {
        if (SINGLETON == null) {
            SINGLETON = new Pisica();
        }
        return SINGLETON;
    }

    @Override public String toString() {
        return "Nume: " + nume + " Varsta: " + varsta;
    }
}
