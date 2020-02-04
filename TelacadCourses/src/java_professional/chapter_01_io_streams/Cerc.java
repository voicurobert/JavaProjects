package java_professional.chapter_01_io_streams;

import java.io.Serializable;

public class Cerc implements Serializable {
    // transient => nu este transferat prin flux, nu este serializabil
    transient Punct p;
    double raza;

    public Cerc(Punct p, double raza) {
        this.p = p;
        this.raza = raza;
    }
}
