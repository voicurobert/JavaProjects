/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.chapter_2_OBJECT_ORIENTED_DESIGN.exercises.creativity.C_2_28;

import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Robert
 */
public class Alice{
    private String[] packetsToSend;
    private int nrOfPackets = 10;
    
    public Alice(){
        Timer timer = new Timer( "alice" );
        timer.schedule( new TimerTask() {
            @Override
            public void run(){
                createPacket();
            }
        }, 0, 2000 );
    }
    
    private void createPacket(){
        packetsToSend = new String[ nrOfPackets ];
        for( int i = 0; i < nrOfPackets; i++ ){
            packetsToSend[ i ] = "Packet" + i;
        }
        
    }

    public String[] getPacketsToSend(){
        return packetsToSend;
    }
    
    
                
}
