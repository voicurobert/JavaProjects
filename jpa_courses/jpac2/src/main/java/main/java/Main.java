/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main.java;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import main.java.entities.Event;
import main.java.entities.Product;


public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();
        Event e = new Event();
        e.setDescription("Event");
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
        em.close();
    }
}
