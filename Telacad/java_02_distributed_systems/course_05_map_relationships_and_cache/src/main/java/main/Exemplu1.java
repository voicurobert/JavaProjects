package main;

import db.Persoana;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashMap;

public class Exemplu1 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        Persoana p1 = new Persoana();
        p1.setPrieteni(new HashMap<String, String>());
        p1.getPrieteni().put("321311", "Popescu");
        p1.getPrieteni().put("434232", "Popescu2");

        em.getTransaction().begin();
        em.persist(p1);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
