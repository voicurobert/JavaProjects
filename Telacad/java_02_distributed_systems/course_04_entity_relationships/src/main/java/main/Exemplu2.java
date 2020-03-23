package main;

import db.Angajat;
import db.LocParcare;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Exemplu2 {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        Angajat angajat = em.find(Angajat.class, 1);
        System.out.println(angajat);

        em.close();
        emf.close();
    }
}
