package main;

import db.JavaCurs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Exemplu4 {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();


        JavaCurs javaCurs = new JavaCurs();
        javaCurs.setInstructor("laur");
        javaCurs.setDurata(4);

        em.getTransaction().begin();
        em.persist(javaCurs);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
