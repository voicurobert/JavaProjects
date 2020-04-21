package ejb;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import javax.jms.JMSConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.JMSProducer;
import javax.jms.Queue;


@Singleton
@Startup
public class Producator1 {

    @Resource(mappedName = "jms/myQueue1")
    private Queue myQueue1;

    @Inject
    @JMSConnectionFactory("java:comp/DefaultJMSConnectionFactory")
    private JMSContext context;

    @PostConstruct
    private void init() {
        JMSProducer producer = context.createProducer();
        for (int i = 0; i<10; i++) {
            producer.send(myQueue1, String.valueOf(i));
        }
    }
}
