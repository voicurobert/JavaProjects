/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_1_professional.chapter_06_ui.design_patterns.observer;

/**
 *
 * @author robert
 */
public class User implements Listener {

    String nume;

    public User(String nume) {
        this.nume = nume;
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(nume + " a primit mesajul " + message);
    }

}
