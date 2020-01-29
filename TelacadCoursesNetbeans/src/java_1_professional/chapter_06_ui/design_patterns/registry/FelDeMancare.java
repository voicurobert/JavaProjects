/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_1_professional.chapter_06_ui.design_patterns.registry;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author robert
 */
public class FelDeMancare {

    public enum Tip {
        DULCE, IUTE
    }

    private static Map< Tip, FelDeMancare> registry = new HashMap<>();

    String nume;

    public static FelDeMancare getInstance(Tip tip) {
        if (!registry.containsKey(tip)) {
            registry.put(tip, new FelDeMancare());
        }
        return registry.get(tip);
    }

}
