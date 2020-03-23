package db;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nume;

    @ElementCollection
    @CollectionTable(name = "numere_telefon")
    private Collection<String> telefoane;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Collection<String> getTelefoane() {
        return telefoane;
    }

    public void setTelefoane(Collection<String> telefoane) {
        this.telefoane = telefoane;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
