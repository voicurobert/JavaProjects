/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 *
 * @author robert
 */
@Singleton
@Startup
@LocalBean
public class MySingleton {
    
    @EJB
    private MySLSB stateless;
    @EJB
    private MySFSB stateful;
    
    @PostConstruct
    public void init() {
        stateless.sayHello("john");
        
        stateful.setNume("Bill");
        stateful.sayHello();
    }
}
