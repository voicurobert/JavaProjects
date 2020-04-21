/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mdb;

import javax.annotation.Resource;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.inject.Inject;
import javax.jms.JMSConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Queue;
import javax.jms.TextMessage;

/**
 *
 * @author robert
 */
@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "jms/myQueue1"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class Listener1 implements MessageListener {
    
    @Inject
    @JMSConnectionFactory("java:comp/DefaultJMSConnectionFactory")
    private JMSContext context;
    
    @Resource(mappedName = "jms/myQueue2")
    private Queue myQueue2;
    
    public Listener1() {
    }
    
    @Override
    public void onMessage(Message message) {
        try {
            TextMessage tm = (TextMessage) message;
            int nr = Integer.parseInt(tm.getText());
            if (nr % 2 == 0) {
                context.createProducer().send(myQueue2, String.valueOf(nr));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
