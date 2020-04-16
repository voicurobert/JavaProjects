/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 *
 * @author robert
 */
@Singleton
@Startup
public class MySingleton {
    
    @EJB
    private CartBean cartBean;
    
    @PostConstruct
    private void init() {
        cartBean.adaugaProdus("bere", 12);
        cartBean.adaugaProdus("ciocolata", 2);
        cartBean.checkOut();
    }
}
