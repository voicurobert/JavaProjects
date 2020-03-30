package library.db;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Curs implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String nume;

    @OneToMany(mappedBy = "curs")
    private List<Instructor> instructori;

    @OneToMany(mappedBy = "curs")
    private List<Clasa> clase;

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

    public List<Instructor> getInstructori() {
        return instructori;
    }

    public void setInstructori(List<Instructor> instructori) {
        this.instructori = instructori;
    }

    public List<Clasa> getClase() {
        return clase;
    }

    public void setClase(List<Clasa> clase) {
        this.clase = clase;
    }

    @Override
    public String toString() {
        return "Curs{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
