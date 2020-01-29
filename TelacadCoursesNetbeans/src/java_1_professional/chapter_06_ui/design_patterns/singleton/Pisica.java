/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_1_professional.chapter_06_ui.design_patterns.singleton;

/**
 *
 * @author robert
 */
public class Pisica {

    // thread safe
    private static Pisica singleton = new Pisica();

    String nume;

    private Pisica() {

    }

    public static Pisica getInstance() {
        /*
        if( singleton == null ){
            singleton = new Pisica();
        }
         */
        return singleton;
    }

}
