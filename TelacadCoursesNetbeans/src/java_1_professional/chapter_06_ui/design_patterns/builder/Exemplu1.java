/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_1_professional.chapter_06_ui.design_patterns.builder;

/**
 *
 * @author robert
 */
public class Exemplu1 {

    public static void main(String[] args) {
        Masina m1 = new Masina.Builder().setMarca("honda").setCombustibil("benzina").build();
    }

}
