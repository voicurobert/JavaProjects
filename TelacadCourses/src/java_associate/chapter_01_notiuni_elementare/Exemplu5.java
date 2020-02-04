package java_associate.chapter_01_notiuni_elementare;

public class Exemplu5 {
    public static void main(String[] args) {
        int zi = 4;
        switch (zi) {
            case 1:
                System.out.println("Luni");
                break;
            case 2:
                System.out.println("Marti");
                break;
            case 3:
                System.out.println("Miercuri");
                break;
            case 4:
                System.out.println("joi");
                break;
            case 5:
                System.out.println("Vineri");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Nu exista aceasta zi!");

        }
    }
}
