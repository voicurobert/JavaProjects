/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.chapter_1_JAVA_PRIMER.exercises.reinforcement;

/**
 * Write a short Java method that takes an integer n and returns the sum of all the odd 
 * positive integers less than or equal to n.
 * @author Robert
 */
public class R_1_06{
    public static void main( String[] args ){
        System.out.println( "Odd sum of 5's: " + oddSum( 5 ) );
        System.out.println( "Odd sum of 4567234's: " + oddSum( 4567234 ) );
    }
    
    public static int oddSum( int n ){
        int oddSum = 0;
        for( int i = 1; i <= n; i++ ){
            if( i % 2 != 0 ){
                 oddSum += i;
            }
           
        }
        return oddSum;
    }
}
