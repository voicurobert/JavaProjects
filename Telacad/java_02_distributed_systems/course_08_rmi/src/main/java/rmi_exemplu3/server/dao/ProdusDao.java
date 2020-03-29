package rmi_exemplu3.server.dao;

import rmi_exemplu3.library.db.Produs;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ProdusDao {
    private EntityManager em;

    public ProdusDao(EntityManager em) {
        this.em = em;
    }

    public void adaugaProdus(Produs produs) {
        em.persist(produs);
    }

    public List<Produs> getAllProducts() {
        String sql = "select p from Produs p";
        TypedQuery<Produs> query = em.createQuery(sql, Produs.class);
        return query.getResultList();
    }

    public void stergeProdus(Produs produs) {
        produs = em.merge(produs);
        em.remove(produs);
    }
}
