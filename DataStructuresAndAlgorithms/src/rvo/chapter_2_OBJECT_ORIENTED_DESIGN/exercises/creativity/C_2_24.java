/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.chapter_2_OBJECT_ORIENTED_DESIGN.exercises.creativity;

/**
 * Write a Java class that extends the Progression class so that each value in the progression is the absolute value of the difference 
 * between the previous two values. You should include a default constructor that starts with 2 and 200 as the first two values and a 
 * parametric constructor that starts with a specified pair of numbers as the first two values.
 * @author Robert
 */

import rvo.chapter_2_OBJECT_ORIENTED_DESIGN.code_examples.AbstractProgression;
import rvo.chapter_2_OBJECT_ORIENTED_DESIGN.code_examples.Progression;

public class C_2_24 extends AbstractProgression{
    private long prev;
    
    public C_2_24( long prev, long current){
        this.prev = prev;
        this.current = current;
    }
    
    public C_2_24(){
        this( 2, 200 );
    }

    @Override
    protected void advance(){
        long previous = this.prev;
        this.prev = current;
        current = Math.abs( current - previous );
    }
    
    
}
