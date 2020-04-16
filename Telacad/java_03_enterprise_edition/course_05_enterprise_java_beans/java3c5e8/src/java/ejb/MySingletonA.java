/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 *
 * @author robert
 */
@Singleton
@Startup
@TransactionManagement(TransactionManagementType.CONTAINER)
public class MySingletonA {
    
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void m1() {
        
    }
}
