/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dto.ClientDTO;
import dto.FacturaDTO;
import dto.LinieFacturaDTO;
import javax.ejb.EJB;
import service.IMainService;

/**
 *
 * @author robert
 */
public class Main {

    @EJB
    private static IMainService service;
    
    public static void main(String[] args) {
        ClientDTO client = new ClientDTO();
        client.setNume("Nume");
        client.setPrenume("Prenume");
        client = service.adaugaClient(client);
        
        FacturaDTO f = new FacturaDTO(10, 2, client);
        LinieFacturaDTO linie1 = new LinieFacturaDTO("bere", 20, 2);
        LinieFacturaDTO linie2 = new LinieFacturaDTO("alune", 10, 200);
        f.getLinii().add(linie1);
        f.getLinii().add(linie2);
        service.adaugaFactura(f);
    }
    
}
