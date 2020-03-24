package main;

import db.Culoare;
import db.Semafor;
import db.Tricou;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashMap;

public class Exemplu3 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        Tricou s1 = new Tricou();
        s1.setTricouri(new HashMap<String, Culoare>());
        s1.getTricouri().put("M", Culoare.GALBEN);
        s1.getTricouri().put("S", Culoare.ROSU);

        em.getTransaction().begin();
        em.persist(s1);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
