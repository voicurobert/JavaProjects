package beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Cerc {
    private double raza;
    @Autowired
    private Punct centru;

    public Cerc() {
    }

    public Cerc(double raza, Punct centru) {
        this.raza = raza;
        this.centru = centru;
    }

    public double getRaza() {
        return raza;
    }

    public void setRaza(double raza) {
        this.raza = raza;
    }

    public Punct getCentru() {
        return centru;
    }

    public void setCentru(Punct centru) {
        this.centru = centru;
    }
}
