/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_1_professional.chapter_06_ui.design_patterns.factory;

/**
 *
 * @author robert
 */
public class Exemplu3 {

    public static void main(String[] args) {
        Path p = Paths.get(Paths.OS.WINDOWS);
        System.out.println(p.getRoot());
    }
}
