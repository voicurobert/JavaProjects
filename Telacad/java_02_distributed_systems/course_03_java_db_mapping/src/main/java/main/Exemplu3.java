package main;

import dao.PersoanaDao;
import db.Persoana;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Date;
import java.time.LocalDate;

public class Exemplu3 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        PersoanaDao persoanaDao = new PersoanaDao(em);

        Persoana p = new Persoana();
        p.setNume("Anca");
        p.setDataNastere(Date.valueOf(LocalDate.now().minusYears(20)));
        persoanaDao.adaugaPersoana(p);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
