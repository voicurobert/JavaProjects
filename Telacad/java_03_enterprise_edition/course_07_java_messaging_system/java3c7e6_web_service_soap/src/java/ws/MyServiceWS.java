package ws;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import service.MyService;

@WebService
@Stateless
public class MyServiceWS {

    @EJB
    private MyService service;
    
    @WebMethod
    @Oneway
    public void useCase(@WebParam String nume) {
        service.useCase(nume);
    }
}
