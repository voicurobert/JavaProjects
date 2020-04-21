/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package timers;

import java.time.LocalDateTime;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.Timeout;
import javax.ejb.Timer;
import javax.ejb.TimerConfig;
import javax.ejb.TimerService;

/**
 *
 * @author robert
 */
@Singleton
@Startup
public class MySingleton {
    
    @Resource
    private TimerService service;
    
    @Resource
    private SessionContext sessionContext;
    
    @PostConstruct
    public void init() {
       // Timer t = service.createIntervalTimer(1000, 1000, new TimerConfig());
       TimerService ts = sessionContext.getTimerService();
    }
    
    @Timeout
    private void timeout() {
        System.out.println("Bau " + LocalDateTime.now());
    }
    
}
