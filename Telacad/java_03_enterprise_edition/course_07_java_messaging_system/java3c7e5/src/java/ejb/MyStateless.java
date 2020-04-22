package ejb;

import java.util.concurrent.Future;
import javax.ejb.AsyncResult;
import javax.ejb.Asynchronous;
import javax.ejb.Stateless;

@Stateless
public class MyStateless {

    @Asynchronous
    public void m1() {
        try {
            Thread.sleep(5000);
            System.out.println("Metoda M1");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public Future<String> m2() {
        try {
            Thread.sleep(5000);
            System.out.println("Metoda M1");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Future<String> future = new AsyncResult<>("Hello");
        return future;
    }
}
