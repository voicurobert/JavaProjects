package main;

import dao.ProdusDao;
import db.Produs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Exemplu1 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        ProdusDao produsDao = new ProdusDao(em);
        em.getTransaction().begin();

//        Produs p1 = new Produs();
//        p1.setNume("Ciocolate");
//        p1.setPret(10);
//
//        produsDao.adaugaProdus(p1);
//        Produs produs = produsDao.getProdus(21);
//        System.out.println(produs);

//        Produs p2 = new Produs();
//        p2.setId(21);
//        p2 = produsDao.mergeProdus(p2);
//        produsDao.stergeProdus(p2);

        Produs produs = produsDao.getProdus(1);
        produs.setPret(444); // this will update the record
        em.getTransaction().commit();

        em.close();
        emf.close();

    }
}
