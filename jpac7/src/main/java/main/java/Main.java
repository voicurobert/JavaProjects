/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main.java;

import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import main.java.entities.Professor;

import main.java.entities.Student;


public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Professor p1 = new Professor();
        p1.setName("P");
        
        Student s1 = new Student();
        s1.setName("S");
        
        s1.setProfessors(new ArrayList<>());
        s1.getProfessors().add(p1);
        
        p1.setStudents(new ArrayList<>());
        p1.getStudents().add(s1);
        
        em.persist(s1);
        em.persist(p1);
        
        
        em.getTransaction().commit();
        em.close();
        
    }
}
