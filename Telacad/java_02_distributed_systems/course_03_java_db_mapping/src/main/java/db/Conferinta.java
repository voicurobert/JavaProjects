package db;

import javax.persistence.*;

@Entity
public class Conferinta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String nume;

    @Embedded
    private Adresa adresa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
