/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.chapter_2_OBJECT_ORIENTED_DESIGN.exercises.creativity.C_2_28;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Robert
 */
public  class InternetService{
   
    private Alice alice = new Alice();
    private Bob bob = new Bob();
    
    public InternetService(){
        checkCommunication();
        
    }
    
    public void checkCommunication(){
        Timer timer = new Timer( "alice" );
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run(){
                if( alice.getPacketsToSend().length > 0 ){
                        for( int i = 0; i < alice.getPacketsToSend().length; i++ ){
                            bob.readPacket( alice.getPacketsToSend()[ i ] );
                        }
                    } 
            }
        };
        timer.schedule( timerTask, 0, 2000 );
    }
}
