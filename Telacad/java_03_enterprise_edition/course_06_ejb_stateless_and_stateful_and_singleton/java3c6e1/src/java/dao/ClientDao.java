/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import db.Client;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author robert
 */

@Stateless
@TransactionAttribute(TransactionAttributeType.MANDATORY)
public class ClientDao {

    @PersistenceContext
    private EntityManager em;
    
    public void adaugaClient(Client client) {
        em.persist(client);
        em.flush();
    }
    
    public Client findClient(int id) {
        return em.find(Client.class, id);
    }
}
