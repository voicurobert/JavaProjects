/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.chapter_1_JAVA_PRIMER.code_examples;

import java.util.Scanner;

/**
 *
 * @author Robert
 */
public class InputExample{

    public static void main( String[] args ){
        Scanner input = new Scanner( System.in );
        System.out.print( "Enter your age in years: " );
        double age = input.nextDouble();
        System.out.print( "Enter your maximum heart rate: " );
        double rate = input.nextDouble();
        double fb = ( rate - age ) * 0.65;
        System.out.println( "Your ideal fat-burning heart rate is " + fb );
    }
}
