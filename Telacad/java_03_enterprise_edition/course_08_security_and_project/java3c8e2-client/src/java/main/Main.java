/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import gui.RegisterFrame;
import javax.ejb.EJB;
import remote.IMainService;

/**
 *
 * @author robert
 */
public class Main {

    @EJB
    public static IMainService iMainService;
   
    public static void main(String[] args) {
        RegisterFrame frame = new RegisterFrame();
        frame.setVisible(true);
    }
    
}
