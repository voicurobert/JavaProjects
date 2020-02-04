package ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SingularFloods{

    // I N P U T      D A T A

    private double T9 = 0;
    private double T0 = 0;
    private double Q1 = 0;
    private double G0 = 0;
    private double T = 0;
    private double W = 0;


    

    private double T1;
    private double T3;
    private double W1;

    private double R1 = 0;
    private double R2 = 0;
    private double R3 = 0;
    private double P7 = 0, P8, P3, G1;
    private double firstArgument = 0;
    private double secondArgument = 0;
    private double thirdArgument = 0;
    private double sqrtValue;
    private double A0 = 0;
    private double T2 = 0;
    private double T4 = 0;
    private double T5 = 0;
    private double R0 = 0;
    private double B0 = 0;
    private double C0 = 0;
    private double K = 0;
    private double W2 = 0;
    private double L0 = 0;
    private double G = 0;
    private double h = 0;
    private double E1 = 0;
    private double F1 = 0;
    private Map< Double, Double > flowValues = new HashMap<>(  );



    public SingularFloods( int floodLifeTime, int maximumFlow, int raiseTime, int shapeCoeficient, int flowStep ){
        T9 = floodLifeTime;
        Q1= maximumFlow;
        T0= raiseTime;
        G0 = shapeCoeficient;
        T = flowStep;
    }


    /*
    Main method that calculates the singular floods!
     */
    public void calculateSingularFloods(){

        W = G0 * Q1 * T9;

        T1 = T9 / T0;

        T3 = G0 * T1;
        W1 = T3;

        // why 60???
        // probably the first "for" represents the "raise" of the flood
        for( int L1 = 1; L1 <= 60; L1++ ){
            R1 = T1 - 1;
            R2 = calculateR2( L1 );
            R2 = R2 - 2;
            System.out.println( "R2 " + R2 );
            if( R2 >= 0 ){
                R3 = Math.sqrt( R2 );
                System.out.println( "R3 " + R3 );
                E1 = E1 + calculateE1( L1, R3 );
                System.out.println( "E1 " + E1 );
                if( E1 == W1 ){
                    L4680( L1 );
                }
                if( E1 > W1 ){
                    L4200( L1 );
                }
            }
            L4200( L1 );
            System.out.println( "###############################" );
        }

        // probably second "for" represents the "decrease" of the flood
        for( int L0 = 1; L0 <= 500; L0++){

            F1 = T2 + 0.01 * L0;
            // P7 = T1 - 1; -> R1
            P8 = calculateR2( F1 );

            P3 = Math.sqrt( P8 );

            G1 = G1 + calculateE1( F1, P3 );

            if( G1 == W1 ){
                L4720();
            }
            if( G1 > W1 ){
                L4620();
            }
            if( L0 != 1 ){
                L4560();
            }
            R0 = ( ( F1 - T2 ) * ( T3 - W1 ) ) / ( T3 - G1 );
            A0 = T2 + R0;
            L4740();
        }

        System.out.println( "Volume: " + W );
        System.out.println( "Calculated volume" + W2 );
    }

   private double calculateR2( double L1 ){
        return ( 4 * L1 * R1 ) - Math.pow( R1MinusOne(), 2 );
   }


   private double R1MinusOne(){
        return R1 - 1;
   }

   private double raiseL1( double L1 ){
        return Math.pow( L1, 2 );
   }

   private void calculateFirstArgument( double L1F1 ){
        firstArgument = ( ( L1F1 + 1 ) * R1MinusOne() * Math.log( R1 ) ) / raiseL1( L1F1 );
   }

   private void calculateSecondArgument( double L1F1, double R3P3  ){
        secondArgument = ( ( L1F1 + 1 ) * ( R2 - 2 * L1F1 * R1 ) ) / ( raiseL1( L1F1 ) * R3P3 );
   }

   private void calculateThirdArgument( double L1F1, double R3P3  ){
        thirdArgument = Math.atan( ( 2 * L1F1 * R1 + R1MinusOne() ) / R3P3 ) - Math.atan( ( R1MinusOne() - 2 * L1F1 ) / R3P3 );
   }

   private double calculateE1( double L1, double R3P3 ){
        // R4
        calculateFirstArgument( L1 );
       System.out.println( "R4 " + firstArgument );
        // R5
        calculateSecondArgument( L1, R3P3 );
       System.out.println( "R5 " + secondArgument );
        // R6
        calculateThirdArgument( L1, R3P3 );
       System.out.println( "R6 " + thirdArgument );
        return ( firstArgument + ( secondArgument * thirdArgument ) ) - ( T1 / L1 );
   }

   private void L4680( int L1 ){
        A0 = L1;
        L4740();
   }

   private void L4740(){
        B0 = T1 - 2 - 2 * A0;
        C0 = A0 + 1;
        L0 = 0;
        K = 0;
        W2 = 0;
        G = 1;
        h = 0;
        do{
            ++L0;
            ++h;
            if( (h-1) % 8 == 0 ){
                System.out.println( "h " + h );
            }

            flowValues.put( L0, K * ( T9 - K )/( A0 * Math.pow( K, 2 ) + B0 * T0 * K + C0 * Math.pow( T0, 2 ) ) * Q1 );
            W2 = W2 + flowValues.get( L0 ) * T;
            System.out.println( "K: " + K );
            System.out.println( "L0: " + L0 + " value - " + flowValues.get( L0 ) );
            if( L0 % 21 == 0 ){
                G += 15;
          //      System.out.println( "aici2" );
            }
            K += T;
        }while( K <= T9 );
   }

   private void L4200( int L1 ){
        T2 = L1;
        T3 = E1;
   }

   private void L4720(){
        A0 = F1;
   }

   private void L4620(){
        T4 = F1;
        T5 = G1;
   }

   private void L4560(){
        R0 = ( ( F1 - T4 ) * ( T5 - W1 ) ) / ( T5 - G1 );
        A0 = T4 + R0;
        L4740();
   }
}
