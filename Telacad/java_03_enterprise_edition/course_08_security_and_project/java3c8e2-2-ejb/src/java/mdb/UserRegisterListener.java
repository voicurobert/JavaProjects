/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mdb;

import dto.UserDTO;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;


@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "jms/myQueue1"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class UserRegisterListener implements MessageListener {
    
    
    
    @Override
    public void onMessage(Message message) {
        try {
            UserDTO user = message.getBody(UserDTO.class);
            System.out.println("From Message " + user.getUsername());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
