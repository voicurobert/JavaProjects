/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main.java.entities;

import javax.persistence.*;

@Entity
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String name;

    @Embedded
    @AssociationOverride(
            name = "professors",
            joinTable = @JoinTable(
                    name = "student_prof",
                    joinColumns = @JoinColumn(name = "student"),
                    inverseJoinColumns = @JoinColumn(name = "prof")
            )
    )
    private ProfessorDetails professorDetails;
    
    public ProfessorDetails getProfessorDetails() {
		return professorDetails;
	}
    
    public void setProfessorDetails(ProfessorDetails professorDetails) {
		this.professorDetails = professorDetails;
	}
    
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
    
    
}
