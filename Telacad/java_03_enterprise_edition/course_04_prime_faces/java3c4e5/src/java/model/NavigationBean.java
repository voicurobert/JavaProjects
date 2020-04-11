/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author robert
 */

@ManagedBean
@RequestScoped
public class NavigationBean implements Serializable {
    
    public String goToPage2() {
        System.out.println("going to page 2");
        return "doi";
    }
    
    public String goToPage1() {
        System.out.println("going to page 1");
        return "unu";
    }
}
