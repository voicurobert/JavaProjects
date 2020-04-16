/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

/**
 *
 * @author robert
 */
@Singleton
@Startup
@TransactionManagement(TransactionManagementType.BEAN)
public class MySingletonA {

    @Resource
    private UserTransaction utx;

    public void m1() {
        try {
            utx.begin();
            utx.commit();
        } catch (Exception e) {
            try {
                utx.rollback();
            } catch (IllegalStateException ex) {
                Logger.getLogger(MySingletonA.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SecurityException ex) {
                Logger.getLogger(MySingletonA.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SystemException ex) {
                Logger.getLogger(MySingletonA.class.getName()).log(Level.SEVERE, null, ex);
            }
            e.printStackTrace();
        }

    }

}
