/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.chapter_1_JAVA_PRIMER.exercises.reinforcement;

/**
 * Write a short Java method, isMultiple, that takes two long values, n and m, and returns true 
 * if and only if n is a multiple of m, that is, n = mi for some integer i.
 * @author Robert
 */
public class R_1_03{
    public static void main( String[] args ){
        System.out.println( "5 is multiple of 25? " + isMultiple( 5, 25 ) );
        System.out.println( "5 is multiple of 26? " + isMultiple( 5, 26 ) );
        System.out.println( "25 is multiple of 5? " + isMultiple( 25, 5 ) );
    }
    
    public static boolean isMultiple( long n, long m ){
        return m % n == 0;
    }
}
