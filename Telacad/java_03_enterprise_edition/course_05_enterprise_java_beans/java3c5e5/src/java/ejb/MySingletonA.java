/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 *
 * @author robert
 */
@Singleton
public class MySingletonA {
    
    @PostConstruct
    private void init() {
        System.out.println("Singleton A");
    }
}
