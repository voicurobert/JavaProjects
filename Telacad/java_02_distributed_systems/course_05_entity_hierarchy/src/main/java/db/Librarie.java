package db;

import javax.persistence.*;
import java.util.Map;

@Entity
public class Librarie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany
    private Map<String, Carte> carti;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<String, Carte> getCarti() {
        return carti;
    }

    public void setCarti(Map<String, Carte> carti) {
        this.carti = carti;
    }
}
