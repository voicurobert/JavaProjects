/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.chapter_1_JAVA_PRIMER.exercises.creativity;

/**
 * Write a Java method that takes an array of float values and determines if all 
 * the numbers are different from each other (that is, they are distinct).
 * @author Robert
 */
public class C_1_20{
    
    public static void main( String[] args ){
        float[] x = { 9.0f, 3.4f, 1.4f, 5.1f, 3.5f, 5.7f, 1.0f, 1.3f };
        System.out.println( "distinct numbers in: " + distinctNumbers( x ) );
    }
    
    private static boolean distinctNumbers( float[] floats ){
        for( int i = 0; i < floats.length; i++){
            for( int j = 0; j < floats.length; j++){
                if( i != j ){
                    if( floats[ i ] == floats[ j ] ){
                        return true;
                    }
                }
            }
        }
        return true;
    }
}
