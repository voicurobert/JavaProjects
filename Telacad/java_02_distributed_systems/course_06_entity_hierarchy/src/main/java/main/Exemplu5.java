package main;

import db.License;
import db.Masina;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Exemplu5 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        License license = new License();
        license.setRegiune("RO");
        license.setNr(8);
        license.setCod("AAA");

        Masina masina = new Masina();
        masina.setLicense(license);
        masina.setMarca("Honda");

        em.getTransaction().begin();
        em.persist(masina);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
