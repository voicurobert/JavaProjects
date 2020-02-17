package main;


import entities.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.Instant;

public class Example1 {


    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Product p = new Product();
        p.setName("Produs 1");
        em.persist(p);

        em.getTransaction().commit();
        em.close();
    }
}
