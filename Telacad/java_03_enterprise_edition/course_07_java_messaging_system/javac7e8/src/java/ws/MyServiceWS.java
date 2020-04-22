package ws;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
import service.MyService;

@WebService
@Stateless
public class MyServiceWS {

    @EJB
    private MyService service;
    
    @WebMethod
    public String reverse(String str) {
        return service.reverse(str);
    }
}
