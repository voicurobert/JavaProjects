package db;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Persoana {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String nume;

    @Temporal(TemporalType.DATE)
    private Date dataNastere;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Date getDataNastere() {
        return dataNastere;
    }

    public void setDataNastere(Date dataNastere) {
        this.dataNastere = dataNastere;
    }
}
