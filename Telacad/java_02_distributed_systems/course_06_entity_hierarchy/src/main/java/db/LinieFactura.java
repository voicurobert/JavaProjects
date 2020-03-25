package db;

import javax.persistence.*;

@Entity
public class LinieFactura {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String produs;

    private int cantitate;

    private double pret;

    @ManyToOne
    private Factura factura;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProdus() {
        return produs;
    }

    public void setProdus(String produs) {
        this.produs = produs;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    @Override
    public String toString() {
        return "LinieFactura{" +
                "id=" + id +
                ", produs='" + produs + '\'' +
                ", cantitate=" + cantitate +
                ", pret=" + pret +
                '}';
    }
}
