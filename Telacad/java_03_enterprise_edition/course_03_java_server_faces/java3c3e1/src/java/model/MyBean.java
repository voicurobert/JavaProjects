package model;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author robert
 */

// standard java bean, sa fie incapsulata, constructor default si serializabila

@ManagedBean
// numele instantei by default este numele clasei sau se da alt nume prin "name"
public class MyBean implements Serializable {
    
    private String text;
    
    public MyBean() {
        this.text = "Hello from MyBean";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
}
