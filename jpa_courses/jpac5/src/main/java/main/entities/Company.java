/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;

/**
 *
 * @author Robert
 */

@Entity
@SecondaryTable(name = "address", pkJoinColumns = @PrimaryKeyJoinColumn(name = "company"))
@SecondaryTable(name = "miscellaneous", pkJoinColumns = @PrimaryKeyJoinColumn(name = "company"))
public class Company {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String name;
    
    
    
    @Column(table = "address")
    private String number;
    @Column(table = "address")
    private String street;

    @Column(table = "miscellaneous")
    private String details;
    
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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
    
}
