/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.Document;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author robert
 */

@Named
@RequestScoped
public class DocumentDao implements Serializable {
 
    @PersistenceContext
    private EntityManager em;
    
    public void adaugaDocument(Document d) {
        em.persist(d);
    }
    
}
