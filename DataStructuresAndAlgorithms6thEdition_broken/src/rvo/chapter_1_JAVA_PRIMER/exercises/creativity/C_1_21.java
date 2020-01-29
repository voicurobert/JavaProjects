/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.chapter_1_JAVA_PRIMER.exercises.creativity;

import java.util.Random;

/**
 * Write a Java method that takes an array containing the set of all integers in the range 1 to 52 
 * and shuffles it into random order. Your method should output each possible order with equal probability.
 * @author Robert
 */
public class C_1_21{
    public static void main( String[] args ){
        int[] v = createVectorfrom1To52();
        int[] shuffled = shuffleVector( v );
        for( int i = 0; i < shuffled.length; i++ ){
            System.out.println( shuffled[ i ] );
        }
    }
    
    private static int[] createVectorfrom1To52(){
        int[] vector = new int[ 52 ];
        for( int i = 0; i < 52; i++ ){
            vector[ i ] = i + 1;
        }
        return vector;
    }
    
    private static int[] shuffleVector( int[] vector ){
        int[] shufledVector = new int[ vector.length ];
        Random rand = new Random();
        int[] indexes = new int[ 52 ];    
        for( int i = 0; i < vector.length; i++ ){
            
            shufledVector[ i ] = vector[ randomIndex( indexes ) ];
            System.out.println( shufledVector[ i ] );
        }
        return shufledVector;
    }
    
    private static int randomIndex( int[] indexes ){
        int generatedValue = get();
        if( generatedValue == 0 ){
            generatedValue = 1;
        }
        if( indexes.length == 52 ){
            return 0;
        }
        for( int i = 0; i < indexes.length; i++ ){
            if( indexes[ i ] == generatedValue ){
                randomIndex( indexes );
            }
        }
        addValue( generatedValue, indexes );
        return generatedValue;
    }
    
    private static void addValue( int value, int[] values ){
        for( int i = 0; i < values.length; i ++ ){
            if( values[ i ] == 0 ){
                values[ i ] = value;
                return;
            }
        }
    }
    
    private static int get(){
        Random generator = new Random();
        return generator.nextInt( 52 );
    }
}
