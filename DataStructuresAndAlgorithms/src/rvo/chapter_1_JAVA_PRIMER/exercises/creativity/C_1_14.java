/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.chapter_1_JAVA_PRIMER.exercises.creativity;

import java.util.Arrays;
import java.util.Collections;


/**
 * Write a pseudocode description of a method that reverses an array of n
 * integers, so that the numbers are listed in the opposite order than they were
 * before, and compare this method to an equivalent Java method for doing the
 * same thing.
 *
 * @author Robert
 */
public class C_1_14{

    public static void main( String[] args ){
        int[] x = { 1, 7, 3, 5, 9, 5, 3 };
        int[] rev = reverseArrayOfInts( x );
        System.out.println( "Array of [1,7,3,5,9,5,3] reversed: ");
        for( int i = 0; i < rev.length; i++ ){
            //System.out.println( rev[ i ] );
        }
        int[] x2 = { 1, 7, 3, 5, 9, 5, 3 };
        Collections.reverse( Arrays.asList( x2 ) );
        for( int i = 0; i < x2.length; i++ ){
            System.out.println( x2[ i ] );
        }
    }

    public static int[] reverseArrayOfInts( int[] ints ){
        int length = ints.length;
        int[] reversedArray = new int[ length ];
        for( int i = length; i > 0; i-- ){
            reversedArray[ length - i ] = ints[ i - 1 ];
        }
        return reversedArray;
    }
}
