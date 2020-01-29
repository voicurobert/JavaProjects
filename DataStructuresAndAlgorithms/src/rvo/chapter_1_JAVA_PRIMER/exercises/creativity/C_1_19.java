/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.chapter_1_JAVA_PRIMER.exercises.creativity;

/**
 * Write a Java program that can take a positive integer greater than 2 as input and write out the number 
 * of times one must repeatedly divide this number by 2 before getting a value less than 2.
 * @author Robert
 */
public class C_1_19{
    public static void main( String[] args ){
        System.out.println( "number of division by 2 for number 8: " + nrOfDivisionsBy2( 9 ) );
    }
    
    private static int nrOfDivisionsBy2( int number ){
        int nr = 0;
        
        while( true ){
            if( number < 2 ){
                return nr;
            }
            if( number % 2 == 0 ){
                nr +=1 ;
                number = number / 2;
            }else{
                number = number / 2;
                
            }
        }
    }
}
