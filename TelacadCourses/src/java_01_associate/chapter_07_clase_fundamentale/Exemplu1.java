package java_01_associate.chapter_07_clase_fundamentale;

public class Exemplu1 {
    public static void main(String[] args) {
        try {
            System.out.println("A");
            m(6);
            System.out.println("B");

        } catch (MyException e) {
            System.out.println("C");

        } catch (AnotherException e) {
            System.out.println("D");
        } catch (Exception e) {
            System.out.println("E");
        } finally {
            System.out.println("F");
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
