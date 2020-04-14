/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.ProdusDao;
import db.Produs;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.annotation.processing.SupportedSourceVersion;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.lang.model.SourceVersion;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author robert
 */
@ManagedBean
@RequestScoped
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class MainService implements Serializable {

    private Produs produs;
    private List<Produs> allProducts;
    
    
    @PersistenceContext(unitName = "java3c4e7PU")
    private EntityManager em;

    @Resource(name = "conexiune2")
    private javax.transaction.UserTransaction utx;

    @ManagedProperty("#{produsDao}")
    private ProdusDao produsDao;

    @PostConstruct
    private void init() {
        produs = new Produs();
        getAllProducts();
    }

    public void adaugaProdus() {
        try {
            utx.begin();
            em.persist(produs);
            utx.commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            throw new RuntimeException(e);
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

    public void persist(Object object) {
        try {
            utx.begin();
            em.persist(object);
            utx.commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            throw new RuntimeException(e);
        }
    }

    public List<Produs> getAllProducts() {
        return allProducts;
    }

    public void setAllProducts(List<Produs> allProducts) {
        this.allProducts = allProducts;
    }
    
    
    
    public void loadAllProducts() {
        allProducts.addAll(produsDao.getProduseJPQL());
    }

}
