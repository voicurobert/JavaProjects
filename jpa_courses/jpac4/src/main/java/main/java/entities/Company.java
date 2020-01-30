/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main.java.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import main.java.entities.embedabbles.Address;

@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String name;
    
    @Embedded
    // JPA 2.1 or java < 8
    /*
    @AttributeOverrides({
        @AttributeOverride(name = "no", column = @Column(name = "number")),
        @AttributeOverride(name = "str", column = @Column(name = "street"))
    })
    */
    @AttributeOverride(name = "no", column = @Column(name = "number"))
    @AttributeOverride(name = "str", column = @Column(name = "street"))
    private Address address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    
    
}
