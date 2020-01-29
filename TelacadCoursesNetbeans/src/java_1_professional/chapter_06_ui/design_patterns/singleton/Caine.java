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
public class Caine {

    String nume;

    private final static class SingletonHolder {

        public static final Caine SINGLETON = new Caine();
    }

    private Caine() {

    }

    public static Caine getInstance() {
        return SingletonHolder.SINGLETON;
    }
}
