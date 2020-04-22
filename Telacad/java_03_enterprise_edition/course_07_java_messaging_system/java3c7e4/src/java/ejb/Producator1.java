package ejb;


import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import javax.jms.JMSConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.Topic;


@Singleton
@Startup
public class Producator1 {

    @Inject
    @JMSConnectionFactory("java:comp/DefaultJMSConnectionFactory")
    private JMSContext context;
    
    @Resource(mappedName = "jms/myTopic1")
    private Topic topic;
    
    @PostConstruct
    private void init() {
        context.createProducer().send(topic, "Hello");
    }
    
}
