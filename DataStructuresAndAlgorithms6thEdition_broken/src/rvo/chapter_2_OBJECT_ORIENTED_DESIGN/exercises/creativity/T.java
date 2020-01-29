/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.chapter_2_OBJECT_ORIENTED_DESIGN.exercises.creativity;

import java.util.Scanner;

/**
 *
 * @author Robert
 */
public class T{
    public static void main( String[] args ){
        System.out.println( "bla" );
        Scanner scanner = new Scanner( System.in );
        System.out.println( "Enter the polynomial expression... (power symbol should be ^)" );
        String stringPolynom = scanner.nextLine();
        stringPolynom = stringPolynom.replace( " ", "" );
        StringBuilder firstDerivative = new StringBuilder();
        
        char[] chars = stringPolynom.toCharArray();

        for( int i = 0 ; i < chars.length ; i++ ){
            String[] coefAndIndex = nextCoeficient( chars, i );
            int nextIndex = Integer.valueOf( coefAndIndex[ 1 ] );
            String coef = coefAndIndex[ 0 ];
            firstDerivative.append( coef );
            System.out.println( coef );
            System.out.println( nextIndex );
            if( nextIndex == chars.length ){
                break;
            }
        }
        System.out.println( firstDerivative );
    }

    private static boolean isNumber( String string ){
        try{
            Integer.valueOf( string );
            return true;
        }catch( NumberFormatException e ){
            return false;
        }
    }

    private static boolean isMathematicalSymbol( String string ){
        switch( string ){
            case "+":
                return true;
            case "-":
                return true;
            default:
                return false;
        }
    }

    private static String[] nextCoeficient( char[] source, int startingIndex ){
        StringBuilder coef = new StringBuilder();
        int index = 0;
        String[] info = new String[ 2 ];
        for( int i = startingIndex ; i < source.length ; i++ ){
            String s = String.valueOf( source[ i ] );
            if( isNumber( s ) || s.equals("x" ) || s.equals("^" ) ){
                coef.append( s );
                index = i;
            }else if( isMathematicalSymbol( s ) ){
                break;
            }
        }
        info[ 0 ] = coef.toString();
        info[ 1 ] = String.valueOf( index );
        return info;
    }
}
