package dao;

import db.Produs;

import javax.persistence.EntityManager;

public class ProdusDao {
    private EntityManager em;

    public ProdusDao(EntityManager em) {
        this.em = em;
    }

    public void adaugaProdus(Produs produs) {
        em.persist(produs);
    }

    public Produs getProdus(int id) {
        return em.find(Produs.class, id);
    }

    /*
    the instance has to be in the context
     */
    public void stergeProdus(Produs produs) {
        em.remove(produs);
    }

    /*
    merge returns the instance added to the context
     */
    public Produs mergeProdus(Produs produs) {
        return em.merge(produs);
    }

    /*
    detaching all the instances from the context
     */
    public void clearContext() {
        em.close();
    }

    /*
    synchronize the instance from the context with the database
     */
    public void refresh(Produs p) {
        em.refresh(p);
    }

    public void closeContext(){
        em.close();
    }
}
