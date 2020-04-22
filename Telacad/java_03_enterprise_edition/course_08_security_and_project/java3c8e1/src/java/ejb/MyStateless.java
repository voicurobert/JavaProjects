package ejb;

import java.security.Principal;
import javax.annotation.Resource;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;

@Stateless

@RolesAllowed({"ADMIN"})
public class MyStateless {
    
    @Resource
    private SessionContext sessionContext;
    
    @PermitAll
    public void sayHello(String nume) {
        System.out.println("Hello, " + nume);
    }
    
    public void m1() {
        Principal principal = sessionContext.getCallerPrincipal();
        System.out.println(principal.getName());
    }
}
