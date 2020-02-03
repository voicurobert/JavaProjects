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
import main.java.entities.Department;
import main.java.entities.Document;
import main.java.entities.Employee;
import main.java.entities.Person;


public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        /*
        Employee e = new Employee();
        e.setName("ana");
        em.persist(e);
        Department d = new Department();
        d.setName("d");
        d.setEmployees(new ArrayList<>());
        d.getEmployees().add(e);
        em.persist(d);
        */
        
        Person p = new Person();
        p.setName("per");
        //em.persist(p);
        Document d = new Document();
        d.setName("doc");
        d.setPerson(em.find(Person.class, 1));
        em.persist(d);
        
        
        em.getTransaction().commit();
        em.close();
    }
}
