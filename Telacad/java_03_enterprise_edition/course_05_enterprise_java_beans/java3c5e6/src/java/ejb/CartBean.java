/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.ejb.Remove;
import javax.ejb.Stateful;

/**
 *
 * @author robert
 */
@Stateful
public class CartBean {
    
    private Map<String, Integer> produse;
    
    @PostConstruct
    private void init() {
        produse = new HashMap<>();
    }
    
    public void adaugaProdus(String produs, int qty) {
        produse.put(produs, qty);
    }
    
    @Remove
    public void checkOut() {
        System.out.println("S-a facut plata!");
        produse = null;
    }
}
