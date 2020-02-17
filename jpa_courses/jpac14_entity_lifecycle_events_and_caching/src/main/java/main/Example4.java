package main;

import entities.Product;

import javax.persistence.Cache;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Example4 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Product p = em.find(Product.class, 17);
        
        // CACHE
        Cache cache = emf.getCache();
        System.out.println(cache.contains(Product.class, 17));

        em.getTransaction().commit();
        em.close();
    }
}
