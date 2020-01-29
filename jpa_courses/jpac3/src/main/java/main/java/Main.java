/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import main.java.entities.Event;
import main.java.entities.Price;
import main.java.entities.Product;
import main.java.entities.enums.Currency;


public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        /*
        Price p = new Price();
        p.setAmount(20);
        p.setCurrency(Currency.EUR);
        em.persist(p);
        */
        
        /*
        Product p = new Product();
        p.setExpirationDate(LocalDate.now());
        em.persist(p);
        */
        
        Event e = new Event();
        e.setEventTime(LocalDateTime.now());
        em.persist(e);
        em.getTransaction().commit();
        em.close();
    }
}
