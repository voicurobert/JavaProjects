/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.chapter_2_OBJECT_ORIENTED_DESIGN.code_examples;

/**
 *
 * @author Robert
 * @param <T>
 */
public abstract class Progression<T>{
    protected T current;

    public Progression( T current ){
        this.current = current;
    }

    
    public T nextValue(){
        T answear = current;
        advance();
        return answear;
    }
    
    protected abstract void advance();
    
    public void printProgression( int n ){
        System.out.print( nextValue() );
        for( int i = 1; i < n; i++ ){
            System.out.print( " " + nextValue() );
        }
        System.out.println( );
    }
    
}
