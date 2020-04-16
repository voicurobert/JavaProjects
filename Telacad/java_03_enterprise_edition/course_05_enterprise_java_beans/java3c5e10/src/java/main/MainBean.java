/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import service.MainService;

/**
 *
 * @author robert
 */

@Singleton
@Startup
public class MainBean {
    
    @EJB
    private MainService service;
    
    @PostConstruct
    public void init() {
        service.adaguaZeceProduse();
    }
}
