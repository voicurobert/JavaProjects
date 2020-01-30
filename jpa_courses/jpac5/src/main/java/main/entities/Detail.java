/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Detail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private int kcal;
    
    @JoinColumn(name = "product")
    @OneToOne(cascade = CascadeType.PERSIST)
    private Product product;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    
}
