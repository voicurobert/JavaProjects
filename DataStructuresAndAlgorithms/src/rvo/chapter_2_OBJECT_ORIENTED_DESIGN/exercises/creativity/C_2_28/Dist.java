/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.chapter_2_OBJECT_ORIENTED_DESIGN.exercises.creativity.C_2_28;

/**
 *
 * @author Robert
 */
public class Dist{
    public static void main( String[] args ){
        System.out.println( distance( 44.428841, 26.1662175, 47.5540091, 18.3300399) );
    }
    // lat1: 44.4284841
	// long1: 26.1662175
	// lat2: 47.5540091
	// long2: 18.3300399
    public static double distance( double lat1, double long1, double lat2, double long2 ){
		lat1 = Math.toRadians( lat1 );
		long1 = Math.toRadians( long1 );
		lat2 = Math.toRadians( lat2 );
		long2 = Math.toRadians( long2 );
		double earthRadius = 6371.01;
		return earthRadius * Math.acos( Math.sin( lat1 ) * Math.sin( lat2 ) + Math.cos( lat1 ) * Math.cos( lat2 ) * Math.cos( long1 - long2 ) );
	}
}
