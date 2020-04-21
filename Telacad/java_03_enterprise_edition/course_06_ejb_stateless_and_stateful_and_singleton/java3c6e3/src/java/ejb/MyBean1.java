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
public class MyBean1 {

    @EJB
    private MyBean2 myBeans2;
    
    @PostConstruct
    public void m1() {
        
        int rez = myBeans2.m1(10, 20);
        System.out.println(rez);
    }
}
