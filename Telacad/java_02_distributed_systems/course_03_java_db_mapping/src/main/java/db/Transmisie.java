package db;

import javax.persistence.*;

@Entity
public class Transmisie {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;

    private String mesaj;

    private TipTransmisie tipTransmisie;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }

    public void setTipTransmisie(TipTransmisie tipTransmisie) {
        this.tipTransmisie = tipTransmisie;
    }

    @Enumerated(EnumType.STRING)
    public TipTransmisie getTipTransmisie() {
        return tipTransmisie;
    }

    @Override
    public String toString() {
        return "Transmisie{" +
                "id=" + id +
                ", mesaj='" + mesaj + '\'' +
                ", tipTransmisie=" + tipTransmisie +
                '}';
    }
}
