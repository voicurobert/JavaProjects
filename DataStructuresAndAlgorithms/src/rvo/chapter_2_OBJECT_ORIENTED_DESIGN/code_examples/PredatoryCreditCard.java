/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.chapter_2_OBJECT_ORIENTED_DESIGN.code_examples;

import rvo.chapter_1_JAVA_PRIMER.code_examples.CreditCard;

/**
 *
 * @author Robert
 */
public class PredatoryCreditCard extends CreditCard{
    private double apr;
    private int counter = 0;
    private static final int MAX_CHARGES = 10;

    public PredatoryCreditCard( double apr, String customer, String bank, String account, int limit, double initialBalance ){
        super( customer, bank, account, limit, initialBalance );
        this.apr = apr;
    }
    
    public void processMonth(){
        if( balance > 0 ){
            double monthlyFactor = Math.pow( 1 + apr, 1.0/12 );
            balance *= monthlyFactor;
        }
        // reset counter, a new month has started
        counter = 0;
    }
    
    public boolean charge( double price ){
        boolean isSuccess = super.charge( price );
        if( !isSuccess ){
            balance += 5;
            if( counter >= MAX_CHARGES ){
                super.charge( -1 );
            }
            counter++;
        }
        return isSuccess;
    }
    
}
