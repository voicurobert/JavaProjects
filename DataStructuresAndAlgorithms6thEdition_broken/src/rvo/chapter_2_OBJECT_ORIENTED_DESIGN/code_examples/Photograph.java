/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.chapter_2_OBJECT_ORIENTED_DESIGN.code_examples;

/**
 *
 * @author Robert
 */
public class Photograph implements Sellable{
    
    private String description;
    private int price;
    private boolean color;

    public Photograph( String description, int price, boolean color ){
        this.description = description;
        this.price = price;
        this.color = color;
    }
    
    @Override
    public String description(){
        return description;
    }

    @Override
    public int listPrice(){
        return price;
    }

    @Override
    public int lowestPrice(){
        return price / 2;
    }
    
}
