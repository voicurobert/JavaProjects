package main;

import db.Contact;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;

public class Exemplu8 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Contact c1 = new Contact();
        c1.setNume("C1");
        c1.setTelefoane(new ArrayList<>());
        c1.getTelefoane().add("1361236128312");
        c1.getTelefoane().add("674236478342");

        em.persist(c1);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
