package db;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Masina {

    private String marca;

    @EmbeddedId
    private License license;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }
}
