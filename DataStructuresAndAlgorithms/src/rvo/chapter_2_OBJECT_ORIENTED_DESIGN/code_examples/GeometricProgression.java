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
public class GeometricProgression extends AbstractProgression{
    protected long base;
    
    public GeometricProgression( long base, long start ){
        super( start );
        this.base = base;
    }
    
    public GeometricProgression( long base ){
        this( base, 1 );
    }
    
    public GeometricProgression(){
        this( 2, 1 );
    }
    
    @Override
    protected void advance(){
        current *= base;
    }
}
