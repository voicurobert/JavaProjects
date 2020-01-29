/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.chapter_1_JAVA_PRIMER.exercises.creativity;

/**
 * Write a short Java program that takes two arrays a and b of length n storing int values, 
 * and returns the dot product of a and b. That is, it returns an array c of length n such that c[i] = a[i]·b[i], for i = 0,...,n−1.
 * @author Robert
 */
public class C_1_23{
    
    public static void main( String[] args ){
        int[] a = { 9, 3, 1, 5, 3, 5, 1 };
        int[] b = { 15, 30, 2, 4, 6, 2, 0 };
        int[] c = dotProduct( a, b );
        System.out.println( "Dot product of { 9, 3, 1, 5, 3, 5, 1 } and { 15, 30, 2, 4, 6, 2, 0 } :" );
        for( int i = 0; i < c.length; i++ ){
            System.out.println( c[ i ] );
        }
    }
    
    private static int[] dotProduct( int[] a, int[] b ){
        int length = a.length;
        if( length != b.length ){
            System.out.println( "Arrays have different sizes!" );
            return null;
        }
        int[] c = new int[ length ];
        for( int i = 0; i < length; i++ ){
            c[ i ] = a[ i ] * b[ i ];
        }
        return c;
    }
}
