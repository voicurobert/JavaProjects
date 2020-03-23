package db;

import javax.persistence.*;

@Entity
public class Persoana {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nume;

    @OneToOne
    private CardAcces cardAcces;

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

    public CardAcces getCardAcces() {
        return cardAcces;
    }

    public void setCardAcces(CardAcces cardAcces) {
        this.cardAcces = cardAcces;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", cardAcces=" + cardAcces +
                '}';
    }
}
