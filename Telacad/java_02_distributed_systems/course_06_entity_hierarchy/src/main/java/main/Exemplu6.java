package main;

import db.License;
import db.Masina;
import db.NumeComplet;
import db.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Exemplu6 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        NumeComplet numeComplet = new NumeComplet();
        numeComplet.setNume("Voicu");
        numeComplet.setPrenume("Robert");

        Student student = new Student();
        student.setNume(numeComplet.getNume());
        student.setPrenume(numeComplet.getPrenume());
        student.setVarsta(22);

        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
