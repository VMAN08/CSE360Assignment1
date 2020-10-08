package cse360assignment02;

/** 
 * Vikram Dattatri
 * CSE 360 - Professor Gonzalez-Sanchez
 * 10/7/2020
 * This program acts as a simple calculator that keeps track of its arithmetic history
 * 
*/

/** Open class  */
public class AddingMachine {
	
	/** private integer variable to hold the calculator's arithmetic total */
	private int total;
	  
	  /**  Default constructor */	  	
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	  }
	  
      /**  Method to return total arithmetic value of calculator total */	  
	  public int getTotal () {
	    return 0;
	  }
	  
      /**  Method to add incoming values to calculator total */		  
	  public void add (int value) {
	  }
	  
	  /**  Method to subtract incoming values from calculator total */	
	  public void subtract (int value) {
	  }
	  
	  /**  Method to keep a history of transactions to be returned */	
	  public String toString () {
	    return "";
	  }
	  
	  /**  Method to clear value of calculator total and its history */	
	  public void clear() {
	  }
	}
