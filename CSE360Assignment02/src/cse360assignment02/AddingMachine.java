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
	  private String history = "0";
	  
	  /**  Default constructor */	  	
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	  }
	  
      /**  Method to return total arithmetic value of calculator total */	  
	  public int getTotal () {
	    return total;
	  }
	  
      /**  Method to add any incoming values to calculator total */		  
	  public void add (int value) {
		  total += value;
		  history += " + " + value;
	  }
	  
	  /**  Method to subtract any incoming values from calculator total */	
	  public void subtract (int value) {
		  total -= value;
		  history += " - " + value;
	  }
	  
	  /**  Method to keep a history of transactions to be returned */	
	  public String toString () {
	    return history;
	  }
	  
	  /**  Method to clear value of calculator total and its history */	
	  public void clear() {
		  total = 0;
		  history = "";
	  }
	  
	  /** Create main method for testing program */
	  public static void main(String[] args) {
		 
		  /** Create new AddingMachine object */
		  AddingMachine myAddingMachine = new AddingMachine();
		 
		  /** Run arithmetic methods of AddingMachine */
		  myAddingMachine.add(4);
		  myAddingMachine.subtract(2);
		  myAddingMachine.add(5);
		  
		  /** Use toString() method to display calculation history and getTotal() for total of calculations */
		  System.out.println(myAddingMachine.toString());
		  System.out.println("Total = " + myAddingMachine.getTotal());
	  }
	}
