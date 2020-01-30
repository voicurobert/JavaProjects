/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main.java.entities.embedabbles;

import java.io.Serializable;
import javax.persistence.Embeddable;


@Embeddable
public class BuildingPK implements Serializable {
    private int no;
    private String code;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
}
