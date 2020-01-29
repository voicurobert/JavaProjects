/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.chapter_1_JAVA_PRIMER.code_examples;



/**
 *
 * @author Robert
 */
public class CreditCard{
    private String customer; // name of the Customer
    private String bank; // name of the bank 
    private String account; // account identifier
    private int limit; // account credit limit
    protected double balance; // current balance

    public CreditCard( String customer, String bank, String account, int limit, double initialBalance ){
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = initialBalance;
    }

    public CreditCard( String customer, String bank, String account, int limit ){
        this( customer, bank, account, limit, 0.0 );
    }
    
    public String getAccount(){
        return account;
    }

    public double getBalance(){
        return balance;
    }

    public String getBank(){
        return bank;
    }

    public String getCustomer(){
        return customer;
    }

    public int getLimit(){
        return limit;
    }

    /**
     * Charges the gives price to the card, assuming sufficient credit limit
     * @param price The amount to be charged
     * @return true if charge is accepted; false otherwise
     */
    public boolean charge( double price ){
        if( price + balance > limit ){
            return false;
        }
        balance += price;
        return true;
    }

    public void makePayment( double amount ) throws IllegalArgumentException{
        if( amount < 0.0 ){
            System.out.println( "Cannot make the payment! The amount is negative" );
            throw new IllegalArgumentException( "Negative argument" );
        }
        balance -= amount;
    }

    public void setLimit( int limit ){
        this.limit = limit;
    }
    
    

    private void printSummary(){
        System.out.println( "Customer: " + this.customer );
        System.out.println( "Bank: " + this.bank );
        System.out.println( "Account: " + this.account );
        System.out.println( "Balance: " + this.balance );
        System.out.println( "Limit: " + this.limit );
    }

    @Override
    public String toString(){
        return "Customer: " + this.customer + " Bank: " + this.bank + " Account: " 
                + this.account + " Balance: " + String.valueOf( this.balance ) + " Limit: " + String.valueOf( this.limit );
    }
    
    

    public static void main( String[] args ){
        CreditCard[] wallet = new CreditCard[ 3 ];
        wallet[ 0 ] = new CreditCard( "John Bowman", "California Savings",
                                      "5391 0375 9387 5309", 5000 );
        wallet[ 1 ] = new CreditCard( "John Bowman", "California Federal",
                                      "3485 0399 3395 1954", 3500 );
        wallet[ 2 ] = new CreditCard( "John Bowman", "California Finance",
                                      "5391 0375 9387 5309", 2500, 300 );
        for( int val = 1; val <= 16; val++ ){
            wallet[ 0 ].charge( 3 * val ); 
            wallet[ 1 ].charge( 2 * val ); 
            wallet[ 2 ].charge( val );
        }
        for( CreditCard card : wallet ){
            System.out.println( card.toString() );
            while( card.getBalance() > 200.0 ){
                card.makePayment( 200 );
                // calling static method
                System.out.println( "New balance = " + card.getBalance() );
            }
            System.out.println( "\n\n" );
        }
    }
}
