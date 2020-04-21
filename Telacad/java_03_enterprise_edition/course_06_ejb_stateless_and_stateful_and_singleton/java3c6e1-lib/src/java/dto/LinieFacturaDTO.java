/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.io.Serializable;

/**
 *
 * @author robert
 */
public class LinieFacturaDTO implements Serializable {

    private int id;

    private String produs;

    private double pret;

    private int qty;

    public LinieFacturaDTO() {
        
    }

    public LinieFacturaDTO(String produs, double pret, int qty) {
        this.produs = produs;
        this.pret = pret;
        this.qty = qty;
    }
    
    
    
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

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

}
