package main;

import db.Culoare;
import db.Persoana;
import db.Semafor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashMap;

public class Exemplu2 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        Semafor s1 = new Semafor();
        s1.setCulori(new HashMap<Culoare, String>());
        s1.getCulori().put(Culoare.GALBEN, "dsda");
        s1.getCulori().put(Culoare.ROSU, "2222");

        em.getTransaction().begin();
        em.persist(s1);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
