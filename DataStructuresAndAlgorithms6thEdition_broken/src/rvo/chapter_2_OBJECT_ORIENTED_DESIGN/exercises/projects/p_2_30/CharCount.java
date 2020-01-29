/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.chapter_2_OBJECT_ORIENTED_DESIGN.exercises.projects.p_2_30;

/**
 *
 * @author Robert
 */
public class CharCount{
    
    private char character;
    private int frequencyCount;
    
    public CharCount( char c, int count ){
        character = c;
        frequencyCount = count;
    }

    public String toString(){
        return "Char: " + character + " count: " + frequencyCount;
    }

    public char getCharacter(){
        return character;
    }

    public int getFrequencyCount(){
        return frequencyCount;
    }
    
    public void addFrequency(){
        frequencyCount++;
    }
    
}
