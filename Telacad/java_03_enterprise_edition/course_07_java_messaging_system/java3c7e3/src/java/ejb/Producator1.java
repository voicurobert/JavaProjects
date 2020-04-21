package ejb;

import dto.DataSet;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.Singleton;
import javax.ejb.Startup;
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
    
    
    @PostConstruct
    private void init() {
        DataSet dataSet = new DataSet();
        dataSet.setNumbers(Stream.generate(() -> new Random().nextInt()).limit(30).collect(Collectors.toList()));
        dataSet.setName("myDataSet");
        context.createProducer().send(myQueue1, dataSet);
    }
}
