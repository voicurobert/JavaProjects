package main;

import db.Carte;
import db.Catalog;
import db.Librarie;
import db.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashMap;

public class Exemplu6 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        Student s1 = new Student();
        s1.setNume("Student1");
        Student s2 = new Student();
        s2.setNume("Student2");

        Catalog c1 = new Catalog();
        c1.setMedii(new HashMap<Student, Integer>());
        c1.getMedii().put(s1, 9);
        c1.getMedii().put(s2, 4);

        em.getTransaction().begin();
        em.persist(c1);
        em.persist(s1);
        em.persist(s2);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
