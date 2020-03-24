package main;

import db.Adresa;
import db.Culoare;
import db.Locatie;
import db.Semafor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashMap;

public class Exemplu4 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        Locatie l1 = new Locatie();
        l1.setAdrese(new HashMap<String, Adresa>());
        Adresa a1 = new Adresa();
        a1.setOras("Bucuresti");
        a1.setStrada("O strada!");
        l1.getAdrese().put("adresa1", a1);

        Adresa a2 = new Adresa();
        a2.setOras("Bucuresti");
        a2.setStrada("O strada!");
        l1.getAdrese().put("adresa1", a2);


        em.getTransaction().begin();
        em.persist(l1);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
