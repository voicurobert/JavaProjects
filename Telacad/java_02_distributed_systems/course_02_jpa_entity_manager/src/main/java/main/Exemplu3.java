package main;

import db.Angajat;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.stream.Stream;

public class Exemplu3 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Stream.iterate(1, i -> i+1)
                .limit(10).map(i -> new Angajat())
                .peek(angajat -> angajat.setNume("Dorel"))
                .peek(angajat -> angajat.setVarsta(12))
                .forEach(entity -> {
                    em.persist(entity);
                    em.flush();
                });
        em.getTransaction().commit();
    }
}
