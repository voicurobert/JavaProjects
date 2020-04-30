package ws;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
@Stateless
public class MainServiceWS {

    @WebMethod
    public boolean login(@WebParam String username, @WebParam String parola) {
        System.out.println("Login");
        return true;
    }
}
