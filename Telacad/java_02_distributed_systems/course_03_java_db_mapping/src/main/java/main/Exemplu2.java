package main;


import dao.TransmisieDao;
import db.TipTransmisie;
import db.Transmisie;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Exemplu2 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        TransmisieDao trasmisieDao = new TransmisieDao(em);
        em.getTransaction().begin();

        Transmisie transmisie = new Transmisie();
        transmisie.setMesaj("ABC");
        transmisie.setTipTransmisie(TipTransmisie.WIRELESS);
        trasmisieDao.adauga(transmisie);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
