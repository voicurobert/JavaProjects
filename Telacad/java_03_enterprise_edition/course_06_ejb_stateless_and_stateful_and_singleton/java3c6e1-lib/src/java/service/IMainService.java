/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import dto.ClientDTO;
import dto.FacturaDTO;
import dto.LinieFacturaDTO;
import javax.ejb.Remote;


/**
 *
 * @author robert
 */
@Remote
public interface IMainService {

    public ClientDTO adaugaClient(ClientDTO client);
    
    public void adaugaFactura(FacturaDTO factura);
    
    public void adaugaLinieFactura(LinieFacturaDTO linie);
}
