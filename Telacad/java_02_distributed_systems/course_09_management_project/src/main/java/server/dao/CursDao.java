package server.dao;

import library.db.Curs;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class CursDao {
    private EntityManager em;

    public CursDao(EntityManager em) {
        this.em = em;
    }

    public void addCurs(Curs curs) {
        em.persist(curs);
    }

    public List<Curs> getCursuri() {
        String sql = "select c from Curs c";
        TypedQuery<Curs> query = em.createQuery(sql, Curs.class);
        return query.getResultList();
    }
}
