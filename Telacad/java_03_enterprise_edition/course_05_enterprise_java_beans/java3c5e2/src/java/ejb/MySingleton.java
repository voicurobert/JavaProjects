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
    private MyLocal localStateless;
    
    @PostConstruct
    public void init() {
        localStateless.sayHello("John");
    }
}
