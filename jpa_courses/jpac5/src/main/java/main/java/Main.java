/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main.java;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import main.entities.Company;
import main.entities.Detail;
import main.entities.Product;


public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        /*
        Company c = new Company();
        c.setName("SSS");
        c.setStreet("As");
        c.setNumber("2");
        c.setDetails("details");
        em.persist(c);
        */
        
        /*
        Product p = new Product();
        p.setName("P");
        p.setPrice(4);
        em.persist(p);
        */
        /*
        Detail d = new Detail();
        d.setKcal(100);
        d.setProduct(p);
        p.setDetail(d);
        em.persist(d);
        */
        
        Product p = em.find(Product.class, 5);
        
        em.getTransaction().commit();
        em.close();
    }
}
