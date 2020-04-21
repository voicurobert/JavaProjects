package ejb;

import java.util.Random;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.Timeout;
import javax.ejb.TimerService;
import javax.inject.Inject;
import javax.jms.JMSConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.Queue;

@Singleton
@Startup
public class Producator1 {

    @Inject
    @JMSConnectionFactory("java:comp/DefaultJMSConnectionFactory")
    private JMSContext context;
    
    @Resource(mappedName = "jms/myQueue1")
    private Queue myQueue1;
    
    @Resource
    private TimerService timerService;
    
    private Random random;
    
    @PostConstruct
    private void init() {
        random = new Random();
        timerService.createIntervalTimer(1000, 1000, null);
    }
    
    @Timeout
    public void timeout() {
        context.createProducer().send(myQueue1, String.valueOf(random.nextInt(1000)));
    }
    
    
}
