/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.Produs;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author robert
 */

@ManagedBean
@RequestScoped
public class ProdusDao implements Serializable{
    
    @PersistenceContext
    private EntityManager em;
    
    
    public ProdusDao(EntityManager em) {
        this.em = em;
    }
    
    public void adaugaProdus(Produs p) {
        em.persist(p);
    }
}
