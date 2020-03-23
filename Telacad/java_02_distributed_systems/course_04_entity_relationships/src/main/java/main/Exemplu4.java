package main;

import db.Carte;
import db.Librarie;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;

public class Exemplu4 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Librarie librarie = new Librarie();
        librarie.setAdresa("Bucuresti");

        Carte carte1 = new Carte();
        carte1.setTitlu("A");
        carte1.setLibrarie(librarie);

        Carte carte2 = new Carte();
        carte2.setTitlu("B");
        carte2.setLibrarie(librarie);

        librarie.setCarti(new ArrayList<>());
        librarie.getCarti().add(carte1);
        librarie.getCarti().add(carte2);

        em.persist(carte1);
        em.persist(carte2);
        em.persist(librarie);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
