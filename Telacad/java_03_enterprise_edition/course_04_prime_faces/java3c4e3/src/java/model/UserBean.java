/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author robert
 */

public class UserBean implements Serializable {
    
    private String username;
    private String parola;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }
    
    public void afisareUserSiParola() {
        System.out.println(username + " " + parola);
    }
    
}
