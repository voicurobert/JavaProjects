/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.xml.ws.WebServiceRef;
import ws.MyServiceWSService;

/**
 *
 * @author robert
 */
public class Main {

    @WebServiceRef(wsdlLocation = "https://desktop-vdrg7v1:8181/MyServiceWSService/MyServiceWS?wsdl")
    private static MyServiceWSService service;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ws.MyServiceWS port = service.getMyServiceWSPort();
        port.useCase("Gigel");
    }

   
    
}
