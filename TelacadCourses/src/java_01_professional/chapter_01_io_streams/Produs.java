package java_01_professional.chapter_01_io_streams;

import java.io.Serializable;

public class Produs implements Serializable {
    String nume;
    double pret;

    public Produs(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }

}
