/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main.java;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import main.java.entities.Building;
import main.java.entities.Company;
import main.java.entities.Department;
import main.java.entities.Person;
import main.java.entities.embedabbles.Address;
import main.java.entities.embedabbles.BuildingPK;


public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        /*
        Company c = new Company();
        c.setName("BBB");
        c.setAddress(new Address());
        c.getAddress().setCity("Bucuresti");
        c.getAddress().setStr("Bla");
        c.getAddress().setNo("24");
        em.persist(c);
        */
        
        /*
        Department d = new Department();
        d.setName("Dep 1");
        d.setCode("eee");
        d.setNo(10);
        em.persist(d);
        */
        
        Building b = new Building();
        b.setName("BBB");
        b.setBuildingPK(new BuildingPK());
        b.getBuildingPK().setCode("XXSS");
        b.getBuildingPK().setNo(33);
        em.persist(b);
        
        
        Person p = new Person();
        p.setName("fff");
        em.persist(p);
        
        em.getTransaction().commit();
        em.close();
    }
}
