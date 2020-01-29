/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.chapter_2_OBJECT_ORIENTED_DESIGN.exercises.reinforcement;

/**
 *
 * @author Robert
 */
public class R_2_14{
    public static void main( String[] args ){
        arrayReference();
    }
    
    private static void arrayReference(){
        int[] array = new int[ 10 ];
        try{
            array[ 11 ] = 3;
        }catch( ArrayIndexOutOfBoundsException e ){
            System.out.println( "Don't try buffer overflow attacks in Java!" );
        }
    }
}
