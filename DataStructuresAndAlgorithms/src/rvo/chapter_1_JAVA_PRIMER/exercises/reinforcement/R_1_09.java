/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.chapter_1_JAVA_PRIMER.exercises.reinforcement;

/**
 * Write a short Java method that uses a StringBuilder instance to remove all the punctuation 
 * from a string s storing a sentence, for example, transforming the string "Let’s try, Mike!" to "Lets try Mike".
 * @author Robert
 */
public class R_1_09{
    public static void main( String[] args ){
        System.out.println( "String: 'Let’s try, Mike!' with no punctuation: " + removePunctuations( "Let's try, Mike!" ));
    }
    
    public static String removePunctuations( String sentece ){
        StringBuilder sentenceWithNoPunctuation = new StringBuilder();
        int firstIndex = 0;
        int lastIndex = 0;
        for( int i = 0; i < sentece.length(); i++ ){
            char c = sentece.charAt( i );
            if( c == ',' || c == '.' || c == '!' || c == '?' || c == '\'' ){
                lastIndex = sentece.indexOf( c );
                sentenceWithNoPunctuation.append( sentece.substring( firstIndex, lastIndex) );
                firstIndex = lastIndex + 1;
            }
        }
        return sentenceWithNoPunctuation.toString();
    }
}
