package db;

import javax.persistence.*;

@Entity
public class Locuinta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Embedded
    private Adresa adresa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }
}
