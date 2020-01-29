/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.chapter_2_OBJECT_ORIENTED_DESIGN.code_examples;

/**
 *
 * @author Robert
 */
public class FibonacciProgression extends AbstractProgression{
    protected long prev;

    public FibonacciProgression( long first, long second ){
        super( first );
        this.prev = second - first;
    }

    public FibonacciProgression(){
        this( 1, 0 );
    }
    
    @Override
    protected void advance(){
       // long temp = prev;
       // prev = current;
       // current += temp;
        current += prev;
        prev = current - prev;
    }
    
    public void printNthValue( int nth ){
        int i = 1;
        while( i <= nth  ){
            if( i == nth ){
                System.out.println( "Nth (" + nth + ") value is: " + current );
                return;
            }else{
                advance();
                i++;
            }
        }
    }
    
}
