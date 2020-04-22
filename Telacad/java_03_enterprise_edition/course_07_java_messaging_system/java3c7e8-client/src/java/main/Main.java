/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.xml.ws.WebServiceRef;

/**
 *
 * @author robert
 */
public class Main {

    @WebServiceRef(wsdlLocation = "http://192.168.1.103:8080/MyServiceWSService/MyServiceWS?wsdl")
    private static MyServiceWSService service;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        main.MyServiceWS port = service.getMyServiceWSPort();
        System.out.println(port.reverse("Hello"));
    }

   
    
}
