package main;

import db.Catalog;
import db.Concert;
import db.Student;

import javax.persistence.Cache;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.util.Date;
import java.util.HashMap;

public class Exemplu7 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        Concert c1 = new Concert();
        c1.setLocatii(new HashMap<Date, String>());
        c1.getLocatii().put(new Date(System.currentTimeMillis()), "Cluj");


        em.getTransaction().begin();
        em.persist(c1);
        em.getTransaction().commit();

        Cache cache = emf.getCache();
        cache.evict(Concert.class, 1);

        em.close();
        emf.close();
    }
}
