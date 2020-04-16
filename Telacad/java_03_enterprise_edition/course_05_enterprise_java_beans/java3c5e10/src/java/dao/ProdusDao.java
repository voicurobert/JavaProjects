/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.Produs;
import javax.annotation.PostConstruct;
import javax.annotation.processing.SupportedSourceVersion;
import javax.ejb.Stateless;
import javax.lang.model.SourceVersion;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author robert
 */

@Stateless
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class ProdusDao {
    
    @PersistenceContext(name = "java3c5e10PU")
    private EntityManager em;
    
    @PostConstruct
    public void init() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch(Exception e) {
            
        }
    }
    
    public void adaugaProdus(Produs produs) {
        em.persist(produs);
    }
}
