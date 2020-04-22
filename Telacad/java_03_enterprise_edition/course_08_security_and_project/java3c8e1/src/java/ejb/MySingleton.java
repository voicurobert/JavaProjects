package ejb;

import javax.annotation.PostConstruct;
import javax.annotation.security.DeclareRoles;
import javax.annotation.security.RunAs;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
@RunAs("ADMIN")
@DeclareRoles("ADMIN")
public class MySingleton {

    @EJB
    private MyStateless stateless;
    
    @PostConstruct
    private void init() {
        stateless.sayHello("Paul");
    }
}
