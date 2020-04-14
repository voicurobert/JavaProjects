/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.DocumentDao;
import db.Document;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import javax.transaction.NotSupportedException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

/**
 *
 * @author robert
 */

@Named
@RequestScoped
public class MainService implements Serializable {
    
    
    @Inject
    private DocumentDao dao;
    
    private Document document;
    
    @Resource
    private UserTransaction utx;
    
    @PostConstruct
    public void init() {
        document = new Document();
    }

    public DocumentDao getDao() {
        return dao;
    }

    public void setDao(DocumentDao dao) {
        this.dao = dao;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }
    
    
    
    public void adaugaDocument() {
        try {
            utx.begin();
            dao.adaugaDocument(document);
            utx.commit();
        } catch (Exception ex) {
            Logger.getLogger(MainService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
