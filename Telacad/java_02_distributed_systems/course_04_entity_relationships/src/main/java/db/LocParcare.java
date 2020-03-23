package db;

import javax.persistence.*;

@Entity
public class LocParcare {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int numar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    @Override
    public String toString() {
        return "LocParcare{" +
                "id=" + id +
                ", numar=" + numar +
                '}';
    }
}
