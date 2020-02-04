package java_associate.chapter_06_exceptii_si_erori;

public class Exemplu6 {

    public static void main(String[] args) {
        try {
            System.out.println("A");
            if (1 == 1)
                throw new MyRuntimeException();
            System.out.println("B");
        } finally {
            System.out.println("C");
        }
    }

}
