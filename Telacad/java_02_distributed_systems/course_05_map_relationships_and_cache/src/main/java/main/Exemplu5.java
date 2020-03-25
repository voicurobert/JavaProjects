package main;

import db.Carte;
import db.Culoare;
import db.Librarie;
import db.Semafor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashMap;

public class Exemplu5 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        Carte c1 = new Carte();
        c1.setTitlu("Carte");
        Carte c2 = new Carte();
        c2.setTitlu("Carte2");
        Librarie l1 = new Librarie();
        l1.setCarti(new HashMap<String, Carte>());
        l1.getCarti().put("123141", c1);
        l1.getCarti().put("4342", c2);

        em.getTransaction().begin();
        em.persist(l1);
        em.persist(c1);
        em.persist(c2);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
