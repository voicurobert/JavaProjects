/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_1_professional.chapter_06_ui.design_patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author robert
 */
public class Chat {

    private List< Listener> listeners = new ArrayList<>();

    public void addListener(Listener l) {
        listeners.add(l);
    }

    public void notifyListeners(String message) {
        listeners.forEach(l -> l.receiveMessage(message));
    }
}
