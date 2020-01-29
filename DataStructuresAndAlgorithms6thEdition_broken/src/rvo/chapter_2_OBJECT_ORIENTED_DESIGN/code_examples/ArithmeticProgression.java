/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.chapter_2_OBJECT_ORIENTED_DESIGN.code_examples;

/**
 *
 * @author Robert
 * @param <Integer>
 */
public class ArithmeticProgression< T > extends Progression<T>{
    protected int increment;

    public ArithmeticProgression( int stepSize, T start ){
        super( start );
        this.increment = stepSize;
    }

    
    @Override
    protected void advance(){
        
        if( current instanceof Integer){
            Integer c = (Integer)current; 
            c += increment;
            current = (T)c;
        }else if( current instanceof Long){
            Long c = (Long)current;
            c += increment;
            current = (T)c;
        }else if( current instanceof Double){
            Double c = (Double)current;
            c += increment;
            current = (T)c;
        }
    }
    
    
}
