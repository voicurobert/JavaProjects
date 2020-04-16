/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.ConcurrencyManagement;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 *
 * @author robert
 */

@Singleton
@Startup
@ConcurrencyManagement
public class MySingletonB {
    
    private int x, y;
    
    @Lock(LockType.WRITE)
    public void increment() {
        x++;
        y++;
    }
    
    @Lock(LockType.READ)
    public void afisare() {
        System.out.println(x);
        System.out.println(y);
    }
}
