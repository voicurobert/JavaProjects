package main.entities;

import javax.persistence.Entity;

@Entity
public class Manager extends Employee {

    private String responsability;

    public String getResponsability() {
        return responsability;
    }

    public void setResponsability(String responsability) {
        this.responsability = responsability;
    }
}
