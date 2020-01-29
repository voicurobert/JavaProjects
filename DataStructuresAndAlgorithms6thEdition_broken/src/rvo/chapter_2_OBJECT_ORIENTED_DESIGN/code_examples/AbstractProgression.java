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
abstract public class AbstractProgression{
    protected long current;

    public AbstractProgression(){
        this( 0 );
    }

    public AbstractProgression( long current ){
        this.current = current;
    }
    
    public long nextValue(){
        long answear = current;
        advance();
        return answear;
    }
    
    public void printProgression( int n ){
        System.out.print( nextValue() );
        for( int i = 1; i < n; i++ ){
            System.out.print( " " + nextValue() );
        }
        System.out.println( );
    }
    
    protected abstract void advance();
    
}
