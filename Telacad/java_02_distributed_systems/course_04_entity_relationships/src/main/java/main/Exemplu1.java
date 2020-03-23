package main;

import db.Angajat;
import db.LocParcare;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Exemplu1 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        LocParcare locParcare = new LocParcare();
        locParcare.setNumar(22);

        Angajat angajat = new Angajat();
        angajat.setNume("Baby");
        angajat.setLocParcare(locParcare);

        em.persist(locParcare);
        em.persist(angajat);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
