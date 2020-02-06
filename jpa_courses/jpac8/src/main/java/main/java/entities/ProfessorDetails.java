package main.java.entities;

import java.util.List;

import javax.persistence.AssociationOverride;
import javax.persistence.Embeddable;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Embeddable
public class ProfessorDetails {

    @ManyToMany
    private List<Professor> professors;

    public List<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(List<Professor> professors) {
        this.professors = professors;
    }

}
