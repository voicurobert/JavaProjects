/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.Produs;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author robert
 */

@ManagedBean
@RequestScoped
public class ProdusDao implements Serializable{
    
    @PersistenceContext(name = "java3c4e7PU")
    private EntityManager em;
    
    
    public ProdusDao(EntityManager em) {
        this.em = em;
    }
    
    public void adaugaProdus(Produs p) {
        em.persist(p);
    }
    
    public List<Produs> getProduse() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Produs> cq = cb.createQuery(Produs.class);
        Root<Produs> produs = cq.from(Produs.class);
        TypedQuery<Produs> query = em.createQuery(cq);
        return query.getResultList();
    }
    
    public List<Produs> getProduseJPQL() {
        String sql = "select p from Produs";
        TypedQuery<Produs> q = em.createQuery(sql, Produs.class);
        return q.getResultList();
    }
}
