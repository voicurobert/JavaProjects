/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main.java.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.TableGenerator;

@Entity
public class Product {

    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY) // set auto increment to the filed in database
    @TableGenerator(
            name = "key_generator", 
            table = "key_generator",
            pkColumnName = "key_name", // default 
            pkColumnValue = "product_sequence",
            valueColumnName = "key_value",
            allocationSize = 20
    )
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "key_generator")      // create a separate table (key_generator) in the database with two columns
    private Integer id;
    
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
