package main;

import db.Librarie;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Exemplu5 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        Librarie l1 = em.find(Librarie.class, 1);
        System.out.println(l1.getAdresa());
        System.out.println(l1.getCarti());

        em.close();
        emf.close();
    }
}
