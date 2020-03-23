package main;

import db.Articol;
import db.Autor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;

public class Exemplu6 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Autor a1 = new Autor();
        a1.setNume("A1");
        Autor a2 = new Autor();
        a2.setNume("A2");

        Articol articol1 = new Articol();
        articol1.setTitlu("Articol1");
        Articol articol2 = new Articol();
        articol2.setTitlu("Articol2");

        articol1.setAutori(new ArrayList<>());
        articol1.getAutori().add(a1);
        articol1.getAutori().add(a2);

        articol2.setAutori(new ArrayList<>());
        articol2.getAutori().add(a1);
        articol2.getAutori().add(a2);

        a1.setArticole(new ArrayList<>());
        a1.getArticole().add(articol1);
        a1.getArticole().add(articol2);
        a2.setArticole(new ArrayList<>());
        a2.getArticole().add(articol1);
        a2.getArticole().add(articol2);

        em.persist(articol1);
        em.persist(articol2);
        em.persist(a1);
        em.persist(a2);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
