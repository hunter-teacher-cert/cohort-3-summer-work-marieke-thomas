import java.io.*;
import java.util.*;


/**
 * Time class by Team LucidThinkeren
 * Marieke Thomas
 * collaborators: Kate Maschmeyer, Alicia Wade, Moo Joon Park
 */

/**
   INSTRUCTIONS:

   This file contains the starter code for our Time class.

   The class here uses ints for hours, minutes, and seconds but you
   could decide to change the internal representation to just store
   an int representing a number of seconds.

   Place this file in a folder named programming/5/Time.java

   Basic level (complete all):
   - public Time(int hrs, int mins, int secs) - constructor
   - public String toString()
   - public void set(int hrs, int mins, int secs)

   Intermediate level (complete Basic methods plus this method):
   - public void add(Time other)
   - public boolean equals(Time other)

   
   Advanced level (complete Basic + Intermediate + these two methods):
   - public int compareTo(Time other)
   
*/



public class Time {
  // Instance Variable(s)
  // You can change this if you want to use the alternate
  // implementation of just storing the overall seconds.
    
  int hours;
  int minutes;
  int seconds;

  // Constructors
  public Time(){
  	this.hours = 0;
  	this.minutes = 0;
  	this.seconds = 0;
	
  }

  /**
    Parameters:
    - hrs, mins, secs - the time you want to create the class as

    Initialize this instance to represent hrs:mins:secs as the time.
  */
  public Time(int hrs, int mins, int secs){

	  // your code here
    hours = hrs;
    minutes = mins;
    seconds = secs;
  }
    
    
  // Methods

  /**
    returns a string representation of the time
  */
  public String toString(){
	  return(String.format("%02d:%02d:%02d", this.hours, this.minutes, this.seconds));
  }

    /**
       Parameters:
       - hrs,mins,secs - ints representing a time
      - modifies this instance to represent the time hrs:mins:secs
    */
  public void set(int hrs, int mins, int secs){
    this.hours = hrs;
    this.minutes = mins;
    this.seconds = secs;
  }

    

  /**
    Parameters:
    - other - a variable of type Time modifies this instance to represent the result of adding it and the time other.
  */
    public void add(Time other){
	// add the code to add the time represented by other
	// to this instance.
      
      this.hours = this.hours + other.hours + (this.minutes + other.minutes + (this.seconds+other.seconds)/60)/60;
      this.minutes = (this.minutes + other.minutes + (this.seconds+other.seconds)/60)%60;
      this.seconds = (this.seconds + other.seconds)%60;
    }


    /**
       Parameters:
       other - a variable of type Time

       Returns:
       True if this instance and other represents the same time
       false otherwise.
    */
    public boolean equals(Time other){
	// your code here)
      return (this.hours == other.hours && this.minutes == other.minutes && this.seconds == other.seconds);
// change this
    }

    /**
       Parameters:
       other - a variable of type Time

       Returns:
       A positive number if this instance represents a time greater than the time of other (this > other)

       A negative number if this instance represents a time less
       than the time of other (this < other)

       0 if the two instances represent the same time.

    */
    public int compareTo(Time other){
      int GREATER = 1;
      int EQUALS = 0;
      int LESS = -1;
      if (this.hours > other.hours){
        return GREATER;
      } else if (this.hours < other.hours){
        return LESS;
      } else { //hours equal
        if (this.minutes > other.minutes){
          return GREATER;
        } else if (this.minutes < other.minutes){
          return LESS;
        } else { //minutes equal
          if (this.seconds > other.seconds){
            return GREATER;
          } else if (this.seconds < other.seconds){
            return LESS;
          } else{ //seconds equal
            return EQUALS;
          }
        }
      }
    }
        
}//end class