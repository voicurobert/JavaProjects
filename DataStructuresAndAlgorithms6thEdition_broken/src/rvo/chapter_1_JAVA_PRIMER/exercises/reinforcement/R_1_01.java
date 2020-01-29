/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.chapter_1_JAVA_PRIMER.exercises.reinforcement;

import java.util.Scanner;

/**
 * Write a short Java method, inputAllBaseTypes, that inputs a different value of each base type from the standard 
 * input device and prints it back to the standard output device.
 * @author Robert
 */
public class R_1_01{
    
    public static void main( String[] args ){
        inputAllBaseTypes();
    }
    
    public static void inputAllBaseTypes(){
        Scanner input = new Scanner( System.in );
        System.out.println( "Enter an integer:" );
        
        System.out.println( "You entered: " + Integer.valueOf( input.next() ).intValue() );
    }
}
