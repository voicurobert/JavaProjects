package exemplu2.main;

public class Punct {

    @Valoare(22)
    private int x;
    @Valoare(44)
    private int y;

    private Punct() {

    }

    private void afis() {
        System.out.println(x + " " + y);
    }
}
