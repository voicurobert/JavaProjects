package java_associate.chapter_06_exceptii_si_erori;

public class Exemplu5 {

    public static void main(String[] args) {
        System.out.println("Se incearca debitarea");
        try {
            extrageNumerar(1200);
            System.out.println("Extragere reusita");
        } catch (MyException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
    }


    public static void extrageNumerar(double suma) throws MyException {
        if (suma > 1000) {
            throw new MyException();
        }
    }
}
