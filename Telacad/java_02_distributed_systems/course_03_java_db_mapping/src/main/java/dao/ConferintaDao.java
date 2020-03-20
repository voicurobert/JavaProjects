package dao;

import db.Conferinta;

import javax.persistence.EntityManager;

public class ConferintaDao {

    private EntityManager em;

    public ConferintaDao(EntityManager em) {

    }

    public void adaugaConferinta(Conferinta conferinta) {
        em.persist(conferinta);
    }
}
