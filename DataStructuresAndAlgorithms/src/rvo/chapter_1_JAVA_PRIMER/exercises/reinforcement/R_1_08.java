/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.chapter_1_JAVA_PRIMER.exercises.reinforcement;

/**
 * Write a short Java method that counts the number of vowels in a given character string.
 * @author Robert
 */
public class R_1_08{
    public static void main( String[] args ){
        System.out.println( "count of vowels in 'alphabet' is: " + countVowels( "alphabet" ));
    }
    
    public static int countVowels( String word ){
        if( word.length() == 0 ){
            return 0;
        }
        int vowelCount = 0;
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        for( int i = 0; i < word.length(); i++ ){
            for( char c : vowels ){
                if( word.charAt( i ) == c ){
                    vowelCount++;
                    break;
                }   
            }
        }
        return vowelCount;
    }
}
