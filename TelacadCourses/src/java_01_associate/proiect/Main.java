package java_01_associate.proiect;


import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Bere> beres = (List<Bere>) Magazin.getInstance().getProduse().stream()
                                               .filter(produs -> produs instanceof Bere);
        while (true) {
            System.out.println("Comanda: ");
            String comanda = scanner.nextLine();
            String[] vec = comanda.split("\\s+");
            switch (vec[0].toLowerCase()) {
                case "exit":
                    System.out.println("Se inchide programul");
                    return;
                case "ac":
                    Ciocolata c = new Ciocolata();
                    c.nume = vec[1];
                    c.pret = Double.parseDouble(vec[2]);
                    c.kCal = Integer.parseInt(vec[3]);
                    Magazin.getInstance().adaugaProdus(c);
                    System.out.println("S-a adaugat produsul " + c.toString());
                    break;
                case "ab":
                    Bere bere = new Bere();
                    bere.nume = vec[1];
                    bere.pret = Double.parseDouble(vec[2]);
                    bere.pa = Double.parseDouble(vec[3]);
                    Magazin.getInstance().adaugaProdus(bere);
                    System.out.println("S-a adaugat bere " + bere.toString());
                    break;
                case "afisare":
                    Magazin.getInstance().afisareProduse();
                    break;
            }
        }

    }
}
