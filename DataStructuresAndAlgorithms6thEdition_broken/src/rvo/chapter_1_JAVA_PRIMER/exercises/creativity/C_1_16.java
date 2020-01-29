/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.chapter_1_JAVA_PRIMER.exercises.creativity;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Write a short program that takes as input three integers,a,b,and c,from the Java console and determines 
 * if they can be used in a correct arithmetic formula (in the given order), like “a + b = c,” “a = b − c,” or “a ∗ b = c.”
 * @author Robert
 */
public class C_1_16{
    public static void main( String[] args ){
        arithmeticFormula();
    }
    
    public static void arithmeticFormula(){
        Scanner input = new Scanner( System.in );
        System.out.println( "a= " );
        int a = input.nextInt();
        System.out.println( "b= " );
        int b = input.nextInt();
        System.out.println( "c= " );
        int c = input.nextInt();
        System.out.println( a );
        
        System.out.println( "Verifying formula a + b = c ...." );
        if( a + b == c ){
            System.out.println( "Correct" );
        }else{
            System.out.println( "Incorrect" );
        }
        
        System.out.println( "Verifying formula a = b - c ...." );
        if( a == b - c ){
            System.out.println( "Correct" );
        }else{
            System.out.println( "Incorrect" );
        }
    }
}
