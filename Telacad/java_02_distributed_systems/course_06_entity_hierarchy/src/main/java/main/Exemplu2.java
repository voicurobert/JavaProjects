package main;

import db.Bere;
import db.Programator;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Exemplu2 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        Programator p1 = new Programator();
        p1.setNume("AAAAA");
        p1.setLimbaj("Java");



        em.getTransaction().begin();
        em.persist(p1);
        em.getTransaction().commit();


        em.close();
        emf.close();

    }
}
