package mdb;

import dto.DataSet;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;


@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "jms/myQueue1"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class Listener1 implements MessageListener {
    
    public Listener1() {
    }
    
    @Override
    public void onMessage(Message message) {
        try {
            DataSet dataSet = (DataSet) message.getBody(DataSet.class);
            int sum = dataSet.getNumbers().stream().reduce(0, (a, b) -> a + b);
            System.out.println(dataSet.getName() + " sum: " + sum);
        } catch (JMSException ex) {
            ex.printStackTrace();
        }
    }
    
}
