/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.chapter_1_JAVA_PRIMER.exercises.creativity;

/**
 * Write a short Java method that takes an array of int values and determines if there is 
 * a pair of distinct elements of the array whose product is even.
 * @author Robert
 */
public class C_1_17{
    public static void main( String[] args ){
         int[] x = { 9, 3, 1, 5, 3, 5, 1 };
        System.out.println( "even pairs of ints? : " + evenPairOfInts( x ) );
    }
    
    private static boolean evenPairOfInts( int[] ints ){
        boolean isEvenPair = false;
        int length = ints.length;
        for( int i = 0; i < length; i++ ){
            if( ints[ i ] % 2 == 0 ){
                return true;
            }
        }
        return isEvenPair;
    }
    
}
