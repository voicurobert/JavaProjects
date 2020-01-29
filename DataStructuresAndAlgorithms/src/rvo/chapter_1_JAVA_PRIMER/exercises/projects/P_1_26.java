/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.chapter_1_JAVA_PRIMER.exercises.projects;

import java.util.Scanner;

/**
 * Write a short Java program that takes all the lines input to standard input and writes them to standard output in reverse order. 
 * That is, each line is output in the correct order, but the ordering of the lines is reversed.
 * @author Robert
 */
public class P_1_26{
    public static void main( String[] args ){
        listenToStandardInput();
    }
    
    private static void listenToStandardInput(){
        System.out.println( "The following program will listen for string lines, one at a time. Press q or Q to quit the program!\n" );
        System.out.println( "When the program exists, it will print the lines in reverse order\n" );
        System.out.println( "Listening..." );
        String[] lines = new String[ 100 ];
        Scanner input = new Scanner( System.in );
        int count = 0;
        while( true ){
            String line = input.next();
            if( count == 100 ){
                System.out.println( "Limit reached, exit..." );
                break;
            }
            if( line.equals( "q" ) || line.equals( "Q" ) ){  
                break;
            }
            lines[ count ] = line;
            count++;
        }
        System.out.println( "Program exited!" );
        printInReverseOrder( lines );
    }
    
    private static void printInReverseOrder( String[] lines ){
        System.out.println( "\n" );
        System.out.println( "Printing in reversed order" );
        for( int i = lines.length - 1; i >= 0; i-- ){
            if( lines[ i ] != null ){
                System.out.println( lines[ i ] );
            }
        }
    }
}
