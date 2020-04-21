/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author robert
 */
public class FacturaDTO implements Serializable {

    private int id;

    private int numar;

    private int serie;

    private ClientDTO clientDTO;
    
    private Collection<LinieFacturaDTO> linii = new ArrayList<>();
    
    public FacturaDTO() {
        
    }
    
    public FacturaDTO(int numar, int serie, ClientDTO clientDTO) {
        this.numar = numar;
        this.serie = serie;
        this.clientDTO = clientDTO;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public Collection<LinieFacturaDTO> getLinii() {
        return linii;
    }

    public void setLinii(Collection<LinieFacturaDTO> linii) {
        this.linii = linii;
    }

    public ClientDTO getClientDTO() {
        return clientDTO;
    }

    public void setClientDTO(ClientDTO clientDTO) {
        this.clientDTO = clientDTO;
    }
    
    
    
}
