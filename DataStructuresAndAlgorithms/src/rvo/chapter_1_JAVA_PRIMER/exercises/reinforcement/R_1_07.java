/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.chapter_1_JAVA_PRIMER.exercises.reinforcement;

/**
 * Write a short Java method that takes an integer n and returns the sum of the squares of 
 * all positive integers less than or equal to n.
 * @author Robert
 */
public class R_1_07{
    public static void main( String[] args ){
        System.out.println( "Sum of squares 256:" + squaresSum( 256 ) );
    }
    
    public static int squaresSum( int n ){
        int squareSum = 0;
        for( int i = 1; i <= n; i++ ){
            if( Math.sqrt( i ) % 1 == 0 ){
                squareSum += i;
            }
        }
        return squareSum;
    }
}
