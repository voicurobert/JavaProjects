/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.chapter_2_OBJECT_ORIENTED_DESIGN.code_examples;

import rvo.chapter_2_OBJECT_ORIENTED_DESIGN.exercises.creativity.C_2_24;

/**
 *
 * @author Robert
 */
public class TestProgression{
    public static void main( String[] args ){
        Progression prog;
        // ARITHMETIC
        System.out.println( "Arithmetic progression with default increment: " );
        prog = new ArithmeticProgression<>( 2, 0 );
        prog.printProgression( 10 );
        
        
        System.out.println( "Arithmetic progression with increment 5 : " );
        prog = new ArithmeticProgression<>( 5, 0 );
        prog.printProgression( 10 );
        
        System.out.println( "Arithmetic progression with increment 128 : " );
        prog = new ArithmeticProgression<>( 128, 0 );
        prog.printProgression( 10 );
        
        System.out.println( "Arithmetic progression with start 2 : " );
        prog = new ArithmeticProgression<>( 5, 2 );
        prog.printProgression( 10 );
        
        
        // GEOMETRIC 
        System.out.println( "Geometric progression with default base: " );
     //   prog = new GeometricProgression(2);
        prog.printProgression( 10 );
        
        System.out.println( "Geometric progression with base 3 : " );
     //   prog = new GeometricProgression( 3 );
        prog.printProgression( 10 );
        
        
        // FIBONACCI
        System.out.println( "Fibonacci progression with default start values: " );
     //   prog = new FibonacciProgression();
        prog.printProgression( 10 );
        
       
        System.out.println( "Fibonacci progression with start values 4 and 6: " );
     //   prog = new FibonacciProgression( 4, 6 );
        prog.printProgression( 10 );
        
        System.out.println( "Fibonacci progression with start values 2 and 2: " );
       // prog = new FibonacciProgression( 2, 2 );
      //  ( ( FibonacciProgression )prog ).printNthValue( 8 );
        
        System.out.println( "Abs progression with start values 2 and 200: " );
      //  prog = new C_2_24();
      //  ( ( C_2_24 ) prog ).printProgression( 10 );
    }
}
