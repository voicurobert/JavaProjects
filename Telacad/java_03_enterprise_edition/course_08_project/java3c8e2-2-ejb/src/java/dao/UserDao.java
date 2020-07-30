/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.UserDB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author robert
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.MANDATORY)
public class UserDao {
    
    @PersistenceContext
    private EntityManager em;
    
    public UserDB findUser(String username) {
        Query tq = em.createNamedQuery("UserDB.findByUsername");
        tq.setParameter("username", username);
        try {
            return (UserDB) tq.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
    
    public void adaugaUser(UserDB user) {
        em.persist(user);
    }
}
