package jms;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;


@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "clientId", propertyValue = "jms/myTopic1"),
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "jms/myTopic1"),
    @ActivationConfigProperty(propertyName = "subscriptionName", propertyValue = "jms/myTopic1"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic")
})
public class Consumator1 implements MessageListener {
    
    public Consumator1() {
    }
    
    @Override
    public void onMessage(Message message) {
        try {
            TextMessage tm = (TextMessage) message;
            System.out.println("Listener 1" + tm.getText());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
