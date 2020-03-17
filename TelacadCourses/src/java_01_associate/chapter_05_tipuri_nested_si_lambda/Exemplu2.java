package java_01_associate.chapter_05_tipuri_nested_si_lambda;

public class Exemplu2 {

    public static void main(String[] args) {
        Anotimp a1 = Anotimp.VARA;
        switch (a1) {
            case PRIMAVARA:
            case TOAMNA:
                System.out.println("Ploua");
                break;
            case VARA:
                System.out.println("Este cald");
                break;
            case IARNA:
                System.out.println("Este frig");
                break;
        }

        for (Anotimp x : Anotimp.values()) {
            System.out.println(x + " " + x.ordinal() + " " + x.name());
        }

        Coffee.MEDIUM.afisareQty();
        Coffee.BIG.afisareQty();
    }

}
