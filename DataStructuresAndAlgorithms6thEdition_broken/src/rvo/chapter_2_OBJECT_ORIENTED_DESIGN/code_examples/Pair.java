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
public class Pair< A, B>{
    A first;
    B second;

    public Pair( A first, B second ){
        this.first = first;
        this.second = second;
    }

    public A getFirst(){
        return first;
    }

    public B getSecond(){
        return second;
    }
    
    
}
