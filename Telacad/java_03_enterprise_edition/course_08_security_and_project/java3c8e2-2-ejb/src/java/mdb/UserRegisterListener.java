/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mdb;

import dto.UserDTO;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.EJB;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import service.RegisterService;


@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "jms/myQueue3"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class UserRegisterListener implements MessageListener {
    
    @EJB
    private RegisterService service;
    
    @Override
    public void onMessage(Message message) {
        try {
            UserDTO user = message.getBody(UserDTO.class);
            service.register(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
