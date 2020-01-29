/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.chapter_1_JAVA_PRIMER.exercises.creativity;

/**
 * Write a short Java program that outputs all possible strings formed by using the characters 
 * 'c', 'a', 't', 'd', 'o', and 'g' exactly once.
 * @author Robert
 */

public class C_1_22{
    public static void main( String[] args ){
        char[] chars = { 'c', 'a', 't', 'd', 'o', 'g' };
        writeAllPossibleStrings( chars );
    }
    
    private static void writeAllPossibleStrings( char[] chars ){
        for( char c1 : chars ){
            for( char c2 : chars ){
                for( char c3 : chars ){
                    for( char c4 : chars ){
                        for( char c5 : chars ){
                            for( char c6 : chars ){
                                if( c1 != c2 && c2 != c3 && c3 != c4 && c4 != c5 && c5 != c6 ){
                                    System.out.println( "" + c1 + c2 + c3 + c4 + c5 + c6 );
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
