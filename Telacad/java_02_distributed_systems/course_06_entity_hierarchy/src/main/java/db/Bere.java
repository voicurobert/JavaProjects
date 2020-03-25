package db;

import javax.persistence.Entity;

@Entity
public class Bere extends Produs {

    private double procentAlcool;

    public double getProcentAlcool() {
        return procentAlcool;
    }

    public void setProcentAlcool(double procentAlcool) {
        this.procentAlcool = procentAlcool;
    }

    @Override
    public String toString() {
        return "Bere{" +
                "procentAlcool=" + procentAlcool +
                ",pret=" + this.getPret() +
                '}';
    }
}
