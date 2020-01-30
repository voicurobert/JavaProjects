/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main.java.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import main.java.entities.embedabbles.BuildingPK;

@Entity
public class Building {

    @EmbeddedId
    @AttributeOverride(name = "no", column = @Column(name = "number"))
    private BuildingPK buildingPK;
    private String name;

    public BuildingPK getBuildingPK() {
        return buildingPK;
    }

    public void setBuildingPK(BuildingPK buildingPK) {
        this.buildingPK = buildingPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
