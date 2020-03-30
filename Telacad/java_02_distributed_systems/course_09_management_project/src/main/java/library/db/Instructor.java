package library.db;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Instructor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String nume;

    @ElementCollection
    private List<String> specializari;

    @ManyToOne()
    private Curs curs;

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

    public List<String> getSpecializari() {
        return specializari;
    }

    public void setSpecializari(List<String> specializari) {
        this.specializari = specializari;
    }

    public Curs getCurs() {
        return curs;
    }

    public void setCurs(Curs curs) {
        this.curs = curs;
    }
}
