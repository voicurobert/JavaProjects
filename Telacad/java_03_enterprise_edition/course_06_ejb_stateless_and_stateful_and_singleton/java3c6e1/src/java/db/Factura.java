/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package db;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author robert
 */
@Entity
public class Factura implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private int numar;
    
    private int serie;

    @ManyToOne
    private Client client;
    
    @OneToMany(mappedBy = "factura", cascade = CascadeType.ALL  )
    private Collection<LinieFactura> liniiFactura = new ArrayList<>();
    
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

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Collection<LinieFactura> getLinii() {
        return liniiFactura;
    }

    public void setLinii(Collection<LinieFactura> linii) {
        this.liniiFactura = linii;
    }
    
    
    
}
