/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.ProdusDao;
import db.Produs;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.transaction.UserTransaction;

/**
 *
 * @author robert
 */

@ManagedBean
@RequestScoped
public class MainService implements Serializable {
    
    private Produs produs;
    
    @ManagedProperty("#{produsDao}")
    private ProdusDao produsDao;

    @Resource
    private UserTransaction utx;
    
    @PostConstruct
    private void init() {
        produs = new Produs();
    }
    
    public void adaugaProdus() {
        try {
            utx.begin();
             produsDao.adaugaProdus(produs);
            utx.commit();
        } catch (Exception ex) {
            Logger.getLogger(MainService.class.getName()).log(Level.SEVERE, null, ex);
        } 
       
    }
    
    public ProdusDao getProdusDao() {
        return produsDao;
    }

    public void setProdusDao(ProdusDao produsDao) {
        this.produsDao = produsDao;
    }

    public Produs getProdus() {
        return produs;
    }

    public void setProdus(Produs produs) {
        this.produs = produs;
    }
    
    
}
