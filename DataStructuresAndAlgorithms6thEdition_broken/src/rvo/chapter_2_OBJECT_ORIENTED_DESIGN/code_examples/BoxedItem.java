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
public class BoxedItem implements Sellable, Transportable{
    private String description;
    private int price;
    private int weight;
    private boolean hazardous;
    private int heigth = 0 ;
    private int width= 0;
    private int depth = 0;

    public BoxedItem( String description, int price, int weight, boolean hazardous ){
        this.description = description;
        this.price = price;
        this.weight = weight;
        this.hazardous = hazardous;
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

    @Override
    public int weigth(){
        return weight;
    }

    @Override
    public boolean isHazardous(){
        return hazardous;
    }
    
    public int insuredValue(){
        return price * 2;
    }
    
    public void setBox( int h, int w, int d ){
        this.depth = d;
        this.heigth = h;
        this.weight = w;
    }
}
