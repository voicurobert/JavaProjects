package main;

import db.Angajat;
import db.CardAcces;
import db.LocParcare;
import db.Persoana;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Exemplu3 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        CardAcces cardAcces = new CardAcces();
        cardAcces.setSerie("AAADD33");

        Persoana persoana = new Persoana();
        persoana.setNume("BBBB");
        persoana.setCardAcces(cardAcces);

        cardAcces.setPersoana(persoana);

        em.persist(cardAcces);
        em.persist(persoana);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
