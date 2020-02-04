package java_associate.chapter_07_clase_fundamentale;

public class Exemplu3 {
    public static void main(String[] args) {
        try {
            m(6);
        } catch (MyException | AnotherException | OneMoreException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void m(int x) throws MyException, AnotherException, OneMoreException {
        if (x > 10) {
            throw new MyException();
        }
        if (x < 5) {
            throw new AnotherException();
        }

        if (x == 6) {
            throw new OneMoreException();
        }
    }
}
