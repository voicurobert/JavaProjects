package main;

import entities.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Example2 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Product p = em.find(Product.class, 14);
        p.setName("Produs2");
        em.persist(p);

        em.getTransaction().commit();
        em.close();
    }
}
