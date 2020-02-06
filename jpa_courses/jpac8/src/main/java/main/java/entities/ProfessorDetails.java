package main.java.entities;

import java.util.List;

import javax.persistence.Embeddable;

@Embeddable
public class ProfessorDetails {

	private List<Professor> professors;
	
	public List<Professor> getProfessors() {
		return professors;
	}
	
	public void setProfessors(List<Professor> professors) {
		this.professors = professors;
	}
	
}
