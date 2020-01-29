/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main.java.entities;

import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


@Entity
public class Event {

    @Id
    // use this when the ids will go further the limit of INT or LONG
    @GenericGenerator(
            name = "uuid", 
            strategy = "org.hibernate.id.UUIDHexGenerator",
            parameters = @Parameter(name = "separator", value = "-")
    )
    @GeneratedValue(generator = "uuid")
    private String id;

    private String description;
    
   

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
}
