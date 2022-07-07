import java.io.*;
import java.util.*;


/**
 * Driver class for Time class  by Team LucidThinkeren
 * Marieke Thomas
 * collaborators: Kate Maschmeyer, Alicia Wade, Moo Joon Park
 */

/**
   INSTRUCTIONS:

   This file contains the Driver starter code for our Time class.
   
   Add code in main to test all your methods
   
   Place this file in a folder named programming/5/Driver.java

*/


public class Driver {

    public static void main(String[] args) {

	//declare a var of appropriate type to assign an instance of Time to
	Time t;

	//assign var the address of a newly-apportioned Time object
	t = new Time();
    Time t2 = new Time(2, 28, 04);
      Time t3 = new Time(8, 52, 58);
      System.out.println("t2 is " + t2.toString());
  t2.add(t3);
      System.out.println("t2 is " + t2.toString());
      Time t4 = new Time(11, 21, 2);
      System.out.println("t4 and t3 equal? " + t4.equals(t3));
      System.out.println("t4 nd t2 equal? " +t4.equals(t2));
    }//end main()

}//end class