package dao;

import db.Persoana;

import javax.persistence.EntityManager;

public class PersoanaDao {

    private EntityManager em;

    public PersoanaDao(EntityManager em) {
        this.em = em;
    }

    public void adaugaPersoana(Persoana p) {
        em.persist(p);
    }


}
