/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dto.UserDTO;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.JMSConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.Queue;
import remote.IMainService;

/**
 *
 * @author robert
 */
@Stateless
public class MainService implements IMainService {

    @Resource(mappedName = "jms/myQueue1")
    private Queue myQueue;
    
    @Inject
    @JMSConnectionFactory("java:comp/DefaultJMSConnectionFactory")
    private JMSContext context;

    @Override
    public void register(UserDTO user) {
        System.out.println(user.getUsername());
        context.createProducer().send(myQueue, user);
    }
    
}
