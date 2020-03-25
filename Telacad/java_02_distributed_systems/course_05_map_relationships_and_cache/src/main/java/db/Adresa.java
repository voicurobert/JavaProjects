package db;

import javax.persistence.Embeddable;

@Embeddable
public class Adresa {

    private String oras;
    private String strada;

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    public String getStrada() {
        return strada;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }
}
