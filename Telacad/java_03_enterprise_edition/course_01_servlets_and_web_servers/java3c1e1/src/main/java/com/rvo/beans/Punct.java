/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rvo.beans;

import com.rvo.main.NumarAleator;

/**
 *
 * @author robert
 */

public class Punct {
    
    @NumarAleator
    private int x;
    
    private int y;
    
    public void afisareCoordonate() {
        System.out.println(x + " " + y);
    }
}
