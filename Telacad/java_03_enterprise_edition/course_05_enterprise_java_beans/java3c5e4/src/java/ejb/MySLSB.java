/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Local;
import javax.ejb.Stateless;

/**
 *
 * @author robert
 */
@Stateless
@Local(value = {MyLocal.class})
public class MySLSB implements MyLocal {

    @Override
    public void sayHello(String nume) {
        System.out.println("Hello, " + nume);
    }
    
}
