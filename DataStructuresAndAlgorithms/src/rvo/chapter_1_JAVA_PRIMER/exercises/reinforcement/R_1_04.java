/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.chapter_1_JAVA_PRIMER.exercises.reinforcement;

/**
 * Write a short Java method,isEven,that takes an int i and returns true if and only if i is even. 
 * Your method cannot use the multiplication, modulus, or division operators, however.
 * @author Robert
 */
public class R_1_04{
    public static void main( String[] args ){
        System.out.println( "3 is even?: " + isEven( 3 ) );
        System.out.println( "16 is even?: " + isEven( 16 ) );
    }
    
    public static boolean isEven( int i ){
        return ( ( i & 1 ) == 0 );
    }
}
