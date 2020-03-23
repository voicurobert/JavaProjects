package main;

import db.Curs;
import db.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;

public class Exemplu7 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Student s1 = new Student();
        s1.setNume("S1");
        s1.setCursuri(new ArrayList<>());

        Curs c1 = new Curs();
        c1.setNume("C1");
        c1.setStudenti(new ArrayList<>());

        s1.getCursuri().add(c1);
        c1.getStudenti().add(s1);

        em.persist(s1);
        em.persist(c1);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
