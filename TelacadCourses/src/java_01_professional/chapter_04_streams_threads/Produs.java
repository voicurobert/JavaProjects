package java_01_professional.chapter_04_streams_threads;

public class Produs {
    int pret;
    String nume;

    public Produs(int pret, String nume) {
        this.pret = pret;
        this.nume = nume;
    }

    @Override public String toString() {
        return "Produs{" + "pret=" + pret + ", nume='" + nume + '\'' + '}';
    }
}
