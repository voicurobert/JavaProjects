/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author robert
 */

@ViewScoped
@ManagedBean
public class Persoana implements Serializable {
    
    private String nume;
    private String prenume;
    private int varsta;

    private List<Persoana> persoane;
    
    @PostConstruct
    private void init() {
        persoane = new ArrayList<>();
        persoane.add(createPersoana("nume1", "prenume1", 23));
        persoane.add(createPersoana("nume2", "prenume2", 29));
        persoane.add(createPersoana("nume3", "prenume3", 10));
        persoane.add(createPersoana("nume4", "prenume4", 12));
        persoane.add(createPersoana("nume5", "prenume5", 45));
    }
    
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public List<Persoana> getPersoane() {
        return persoane;
    }

    public void setPersoane(List<Persoana> persoane) {
        this.persoane = persoane;
    }
    
    private static Persoana createPersoana(String nume, String prenume, int varsta) {
        Persoana p = new Persoana();
        p.setNume(nume);
        p.setPrenume(prenume);
        p.setVarsta(varsta);
        return p;
    }
    
}
