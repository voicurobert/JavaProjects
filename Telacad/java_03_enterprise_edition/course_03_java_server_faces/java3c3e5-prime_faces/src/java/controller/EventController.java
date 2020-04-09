/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import model.Eveniment;

/**
 *
 * @author robert
 */

@ViewScoped
@ManagedBean
public class EventController implements Serializable{
    
    private String currentName;
    private Date currentDate;
    
    private List<Eveniment> evenimente;
    
    @PostConstruct
    private void init() {
        evenimente = new ArrayList<>();
    }
    
    public void adaugaEveniment() {
        System.out.println("Eveniment adaugat");
        Eveniment ev = new Eveniment();
        ev.setNume(currentName);
        ev.setData(currentDate);
        evenimente.add(ev);
        currentName = null;
        currentDate = null;
    }

    public String getCurrentName() {
        return currentName;
    }

    public void setCurrentName(String currentName) {
        this.currentName = currentName;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public List<Eveniment> getEvenimente() {
        return evenimente;
    }

    public void setEvenimente(List<Eveniment> evenimente) {
        this.evenimente = evenimente;
    }
    
    
}
