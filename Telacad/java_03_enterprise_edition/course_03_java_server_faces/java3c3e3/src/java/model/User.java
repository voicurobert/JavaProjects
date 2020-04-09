/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author robert
 */

@ManagedBean
@SessionScoped
public class User implements Serializable {
    
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getLoginMessage() {
        if (username == null || password == null) {
            return "";
        }
        if (username.equals("gigel") && password.equals("12345")) {
            return "Login reusit";
        } else {
            return "Login nereusit";
        }
    }
    
}
