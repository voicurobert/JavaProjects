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

@ManagedBean
public class MyBean implements Serializable{
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    public void afisareText() {
        System.out.println("Text:" + text);
    }
}
