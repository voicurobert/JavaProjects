package reflection.beans;

import reflection.main.Aleator;
import reflection.main.Atribuie;


public class Punct {
    //@Atribuie(value = 5)
    @Atribuie()
    private int x;
    @Aleator
    private int y;


    private Punct() {
    }

    private void afisare() {
        System.out.println("X: " + x + " Y: " + y);
    }
}
