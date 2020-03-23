package db;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Curs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nume;

    @ManyToMany
    @JoinTable(
            name = "tabela_de_legatura",
            joinColumns = @JoinColumn(name = "join_column_a"),
            inverseJoinColumns = @JoinColumn(name = "join_column_b")
    )
    private Collection<Student> studenti;

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

    public Collection<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(Collection<Student> studenti) {
        this.studenti = studenti;
    }
}
