package main;

import db.Angajat;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Exemplu1 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        Angajat angajat = new Angajat();
        angajat.setNume("Gica");
        angajat.setVarsta(24);
        try {
            em.getTransaction().begin();
            em.persist(angajat);
            em.getTransaction().commit();
        } finally {
            em.close();
        }

    }
}
