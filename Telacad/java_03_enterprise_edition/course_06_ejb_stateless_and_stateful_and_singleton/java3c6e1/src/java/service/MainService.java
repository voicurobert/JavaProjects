/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import dao.ClientDao;
import dao.FacturaDao;
import dao.LinieFacturaDao;
import db.Client;
import db.LinieFactura;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.Stateless;

/**
 *
 * @author robert
 */
@Stateless
public class MainService {

    @EJB
    private ClientDao clientDao;
    
    @EJB
    private FacturaDao facturaDao;
    
    @EJB
    private LinieFacturaDao linieFacturaDao;
    
    
    public void adaugaClient() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Client client = new Client();
            client.setNume("BLA");
            client.setPrenume("Prenume");
            clientDao.adaugaClient(client);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
