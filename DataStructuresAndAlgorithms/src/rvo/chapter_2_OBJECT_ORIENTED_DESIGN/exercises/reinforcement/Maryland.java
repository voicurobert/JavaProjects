/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.chapter_2_OBJECT_ORIENTED_DESIGN.exercises.reinforcement;

/**
 *
 * @author Robert
 */
public class Maryland extends State{

    public Maryland(){
    }
    
    public void printMe(){
        System.out.println( "Read it." );
    }
    
    public static void main( String[] args ){
        Region east = new State();
        State md = new Maryland();
        Object obj = new Place();
        Place usa = new Region();
        md.printMe();
        east.printMe();
        ((Place)obj).printMe();
        obj = md;
        ((Maryland)obj).printMe();
        obj = usa;
        ((Place)obj).printMe();
        usa = md;
        ((Place)usa).printMe();
    }
}
