/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.ProdusDao;
import db.Produs;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author robert
 */
@Stateless
public class MainService {
    
    @EJB
    private ProdusDao produsDao;
    
    public void adaguaZeceProduse() {
        for (int i = 1; i <= 10; i++) {
            Produs p = new Produs();
            p.setNume("Produs " + i);
            p.setPret(20);
            produsDao.adaugaProdus(p);
        }
    }
}
