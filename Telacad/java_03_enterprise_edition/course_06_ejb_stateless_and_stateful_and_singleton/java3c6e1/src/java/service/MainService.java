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
import db.Factura;
import db.LinieFactura;
import dto.ClientDTO;
import dto.FacturaDTO;
import dto.LinieFacturaDTO;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author robert
 */
@Stateless
public class MainService implements IMainService{

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

    @Override
    public ClientDTO adaugaClient(ClientDTO client) {
        Client clientDB = new Client();
        clientDB.setNume(client.getNume());
        clientDB.setPrenume(client.getPrenume());
        clientDao.adaugaClient(clientDB);
        ClientDTO clientDTO = new ClientDTO();
        clientDTO.setId(clientDB.getId());
        clientDTO.setNume(client.getNume());
        clientDTO.setPrenume(client.getPrenume());
        return clientDTO;
    }

    @Override
    public void adaugaFactura(FacturaDTO factura) {
        Factura f = new Factura();
        f.setNumar(factura.getNumar());
        f.setSerie(factura.getSerie());
        Client c = clientDao.findClient(factura.getClientDTO().getId());
        f.setClient(c);
        c.setFacturi(new ArrayList<>());
        c.getFacturi().add(f);
        for(LinieFacturaDTO linie : factura.getLinii()) {
            LinieFactura linieFactura = new LinieFactura();
            linieFactura.setProdus(linie.getProdus());
            linieFactura.setPret(linie.getPret());
            linieFactura.setQty(linie.getQty());
            f.getLinii().add(linieFactura);
            linieFactura.setFactura(f);
        }
        
        facturaDao.adaugaFactura(f);
    }

    @Override
    public void adaugaLinieFactura(LinieFacturaDTO linie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
