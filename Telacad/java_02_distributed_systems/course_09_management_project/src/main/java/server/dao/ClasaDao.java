package server.dao;

import library.db.Clasa;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class ClasaDao {
    private EntityManager em;

    public ClasaDao(EntityManager em) {
        this.em = em;
    }

    public List<Clasa> getClase() {
        String sql = "select c from Clasa c";
        TypedQuery<Clasa> query = em.createQuery(sql, Clasa.class);
        return query.getResultList();
    }

    public void remove(Clasa clasa) {
        clasa = em.merge(clasa);
        em.remove(clasa);
    }
}
