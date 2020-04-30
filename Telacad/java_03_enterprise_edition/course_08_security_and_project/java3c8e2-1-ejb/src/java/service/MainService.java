package service;

import dto.UserDTO;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.JMSConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.Queue;
import remote.IMainService;

@Stateless
public class MainService implements IMainService {

    @Inject
    @JMSConnectionFactory("java:comp/DefaultJMSConnectionFactory")
    private JMSContext context;

    @Resource(mappedName = "jms/myQueue3")
    private Queue queue;
    
    @Override
    public void register(UserDTO user) {
         System.out.println("Registered " + user.getUsername());
         context.createProducer().send(queue, user);
    }
    
    
}
