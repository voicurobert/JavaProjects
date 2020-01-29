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
public class Facebook {

    public static void main(String[] args) {
        User gigel = new User("gigel");
        User maria = new User("maria");
        User costel = new User("costel");

        Chat chat = new Chat();
        chat.addListener(gigel);
        chat.addListener(maria);
        chat.addListener(costel);

        chat.notifyListeners("buna");

    }
}
