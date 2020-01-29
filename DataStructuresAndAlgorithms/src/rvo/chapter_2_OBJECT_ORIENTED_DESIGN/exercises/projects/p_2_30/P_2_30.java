/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.chapter_2_OBJECT_ORIENTED_DESIGN.exercises.projects.p_2_30;

/**
 *  Write a Java program that inputs a document and then outputs a bar-chart plot of the frequencies of each alphabet character 
 * that appears within that document.
 * @author Robert
 */
public class P_2_30{
    
    public static void main( String[] args ){
        System.out.println( "d2" );
        AlphabetBarChartPlot alphabetBarChartPlot = new AlphabetBarChartPlot();
        alphabetBarChartPlot.parseFile( "/Users/Robert/desktop/google.txt" );
        alphabetBarChartPlot.plot();
    }
    
    
    
}
