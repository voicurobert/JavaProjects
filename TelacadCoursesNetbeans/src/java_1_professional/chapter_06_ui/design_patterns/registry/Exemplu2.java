/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_1_professional.chapter_06_ui.design_patterns.registry;

/**
 *
 * @author robert
 */
public class Exemplu2 {

    public static void main(String[] args) {
        FelDeMancare dulce = FelDeMancare.getInstance(FelDeMancare.Tip.DULCE);

        dulce.nume = "prajitura";

        FelDeMancare iute = FelDeMancare.getInstance(FelDeMancare.Tip.IUTE);

        iute.nume = "pizza";

        System.out.println(dulce.nume);
        System.out.println(iute.nume);
    }
}
