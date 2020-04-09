/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.model.chart.PieChartModel;


/**
 *
 * @author robert
 */

@ManagedBean
@ViewScoped
public class ChartBean implements Serializable{
    private int a;
    private int b;
    private int c;
    private int d;

    private PieChartModel model;
    
    @PostConstruct
    private void init() {
        model = new PieChartModel();
        model.set("A", a);
        model.set("B", b);
        model.set("C", c);
        model.set("D", d);
        model.setTitle("Values");
    }
    
    public void incrementA() {
        a++;
        init();
    }
    
    public void incrementB() {
        b++;
        init();
    }
    
    public void incrementC() {
        c++;
        init();
    }
    
    public void incrementD() {
        d++;
        init();
    }
    
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public PieChartModel getModel() {
        return model;
    }

    public void setModel(PieChartModel model) {
        this.model = model;
    }
    
    
    
}
