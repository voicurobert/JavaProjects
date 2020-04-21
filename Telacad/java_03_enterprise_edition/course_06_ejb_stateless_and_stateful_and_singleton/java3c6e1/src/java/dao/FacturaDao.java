/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import db.Factura;
import java.io.Serializable;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author robert
 */
@Stateless
public class FacturaDao implements Serializable {

    @PersistenceContext
    private EntityManager em;
    
    public void adaugaFactura(Factura factura) {
        em.persist(factura);
    }
}
