/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.chapter_2_OBJECT_ORIENTED_DESIGN.exercises.projects.p_2_30;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Robert
 */
public class AlphabetBarChartPlot{
    
    private static final char[] ALPHABET = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 
                                                's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
    private final CharCount[] alphabetCounts = new CharCount[ ALPHABET.length ];

    public AlphabetBarChartPlot(){
        initializeAlphabetVector();
        
    }
    
    private void initializeAlphabetVector(){
        for( int i = 0; i < ALPHABET.length; i++ ){
            alphabetCounts[ i ] = new CharCount( ALPHABET[ i ], 0 );
        }
    }
    
    protected void parseFile( String filepath ){
        try{
            BufferedReader bufferedReader = new BufferedReader( new FileReader( filepath ) );
            String line = bufferedReader.readLine();
            while( line != null ){
                for( Character c : line.toCharArray() ){
                    incrementCharacter( c );
                }
                line = bufferedReader.readLine();
            }
            
        }catch( FileNotFoundException ex ){
            Logger.getLogger( AlphabetBarChartPlot.class.getName() ).log( Level.SEVERE, null, ex );
        }catch( IOException ex ){
            Logger.getLogger( AlphabetBarChartPlot.class.getName() ).log( Level.SEVERE, null, ex );
        }
    }
      
    
    private void incrementCharacter( Character c ){
        for( CharCount charCount : alphabetCounts ){
            if( c.equals( charCount.getCharacter() ) ){
                charCount.addFrequency();
            }
        }
    }
    
    protected void plot(){
        for( CharCount charCount : alphabetCounts ){
            for( int i = 0; i < charCount.getFrequencyCount(); i++ ){
                System.out.print( "#" );
            }
                
            System.out.print( charCount.getCharacter() );
            System.out.println( " " );
        }
    }
}
