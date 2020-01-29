/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.chapter_1_JAVA_PRIMER.exercises.reinforcement;

/**
 * Write a Java class, Flower, that has three instance variables of type String, int, and float, which respectively represent 
 * the name of the flower, its number of petals, and price. Your class must include a constructor method that initializes 
 * each variable to an appropriate value, and your class should include methods for setting the value of each type, 
 * and getting the value of each type.
 * @author Robert
 */
public class R_1_10{
    private String name;
    private int numberOfPetals;
    private float price;

    public R_1_10( String name, int nrOfPetals, float price ){
        this.name = name;
        this.numberOfPetals = nrOfPetals;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public int getNumberOfPetals(){
        return numberOfPetals;
    }

    public float getPrice(){
        return price;
    }

    public void setName( String name ){
        this.name = name;
    }

    public void setNumberOfPetals( int numberOfPetals ){
        this.numberOfPetals = numberOfPetals;
    }

    public void setPrice( float price ){
        this.price = price;
    }
    
    
    
}
