package main;

import db.Articol;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Exemplu3 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        Articol a1 = new Articol();
        a1.setRevista("SSSSS");
        a1.setTitlu("DDDDDD");

        em.getTransaction().begin();
        em.persist(a1);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
