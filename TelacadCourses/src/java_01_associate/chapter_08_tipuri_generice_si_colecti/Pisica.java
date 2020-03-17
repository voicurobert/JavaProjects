package java_01_associate.chapter_08_tipuri_generice_si_colecti;

public class Pisica implements Comparable<Pisica> {
    String nume;
    int varsta;

    public Pisica(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }


    @Override public int compareTo(Pisica o) {
        if (o == null) {
            return -1;
        }

        return this.varsta - o.varsta;
    }
}
