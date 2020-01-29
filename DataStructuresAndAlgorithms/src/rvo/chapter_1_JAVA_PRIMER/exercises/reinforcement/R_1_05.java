/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.chapter_1_JAVA_PRIMER.exercises.reinforcement;

/**
 * Write a short Java method that takes an integer n and returns the sum of all 
 * positive integers less than or equal to n.
 * @author Robert
 */
public class R_1_05{
    public static void main( String[] args ){
        System.out.println( "sum of 9's: " + sum( 9 ) );
        System.out.println( "Odd sum of 4567234's: " + sum( 4567234 ) );
    }
    
    public static int sum( int n ){
        int sum = 0;
        for( int i = 0; i <= n; i++ ){
            sum += i;
        }
        return sum;
    }
}
