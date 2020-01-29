/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.chapter_1_JAVA_PRIMER.exercises.projects;

import java.util.Scanner;

/**
 * Write a Java program that can simulate a simple calculator,using the Java console as the exclusive input and output device. 
 * That is, each input to the calculator, be it a number, like 12.34 or 1034, or an operator, like + or =, can be done on a separate line. 
 * After each such input, you should output to the Java console what would be displayed on your calculator.
 * 
 * @author Robert
 */
public class P_1_27{
    public static void main( String[] args ){
        
    }
    
    private static void startCalculator(){
        System.out.println( "Starting Calculator...\n" );
        System.out.println( "Pressing q or Q will terminate the program!\n" );
        Scanner input = new Scanner( System.in );
        double leftOperand = 0;
        double rightOperand = 0;
        String operation;
        while( true ){
            if( input.hasNextDouble() ){
                leftOperand = input.nextDouble();
            }
        }
    }
}
