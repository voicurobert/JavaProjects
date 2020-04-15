/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;

/**
 *
 * @author robert
 */
@Stateful
@LocalBean
public class MySFSB {
    private String nume;

    public void setNume(String nume) {
        this.nume = nume;
    }
    
    public void sayHello() {
        System.out.println("Hello, " + nume);
    }
}
