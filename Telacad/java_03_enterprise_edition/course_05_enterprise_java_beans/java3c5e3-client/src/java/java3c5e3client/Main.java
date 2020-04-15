/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java3c5e3client;

import ejb.MyRemote;
import javax.ejb.EJB;

/**
 *
 * @author robert
 */
public class Main {

    @EJB
    private static MyRemote myRemote;
    
    
    public static void main(String[] args) {
        myRemote.sayHello("John");
    }
    
}
