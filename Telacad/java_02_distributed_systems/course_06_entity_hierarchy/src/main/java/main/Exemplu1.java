package main;

import db.Bere;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Exemplu1 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

//        Bere b1 = new Bere();
//        b1.setNume("Sadsa");
//        b1.setPret("33");
//        b1.setProcentAlcool(2);
//
//        em.getTransaction().begin();
//        em.persist(b1);
//        em.getTransaction().commit();

        Bere b2 = em.find(Bere.class, 1);
        System.out.println(b2);

        em.close();
        emf.close();

    }
}
