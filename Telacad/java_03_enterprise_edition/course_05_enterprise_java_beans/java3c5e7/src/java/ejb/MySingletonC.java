/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 *
 * @author robert
 */

@Singleton
@Startup
@ConcurrencyManagement(ConcurrencyManagementType.BEAN)
public class MySingletonC {
    
    public synchronized void m1() {
        
    }
}
