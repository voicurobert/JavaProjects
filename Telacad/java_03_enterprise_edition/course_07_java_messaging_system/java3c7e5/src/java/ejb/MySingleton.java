package ejb;

import java.util.concurrent.Future;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class MySingleton {

    @EJB
    private MyStateless s;
    
    @PostConstruct
    private void init() {
        System.out.println("Inainte de apel");
        Future<String> res = s.m2();
        System.out.println("Dupa apel");
        
        try {
            String s = res.get();
            System.out.println("returnat de m2");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
