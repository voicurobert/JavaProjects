/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package timers;

import java.time.LocalDateTime;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 *
 * @author robert
 */
@Singleton
@Startup
public class MyAutomaticTimer {

    @Schedule(second = "*", hour = "*", minute = "*")
    public void timeout() {
        System.out.println("Autom " + LocalDateTime.now());
    }
}
