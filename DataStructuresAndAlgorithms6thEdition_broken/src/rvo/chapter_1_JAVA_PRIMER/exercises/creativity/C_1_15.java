/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.chapter_1_JAVA_PRIMER.exercises.creativity;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Write a pseudocode description of a method for finding the smallest and largest numbers in an array of 
 * integers and compare that to a Java method that would do the same thing.
 * @author Robert
 */
public class C_1_15{
    public static void main( String[] args ){
        int[] x = { 1, 7, 3, 5, 9, 5, 3 };
        System.out.println( "Min value from { 1, 7, 3, 5, 9, 5, 3 } is: " + minValue( x ) );
        System.out.println( "Max value from { 1, 7, 3, 5, 9, 5, 3 } is: " + maxValue( x ) );
    }
    
    public static int minValue( int[] ints ){
        int min = ints[ 0 ];
        for( int i = 1; i < ints.length; i++ ){
            if( ints[ i ] < min ){
                min = ints[ i ];
            }
        }
        return min;
    }
    
    public static int maxValue( int[] ints ){
        int max = ints[ 0 ];
        for( int i = 1; i < ints.length; i++ ){
            if( ints[ i ] > max ){
                max = ints[ i ];
            }
        }
        return max;
    }
}
