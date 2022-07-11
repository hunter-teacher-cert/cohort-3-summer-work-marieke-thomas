/**
 * SuperArray by Team MarvelvsDC
 * Marieke Thomas
 * collaborators: Moo Joon Park, Greg Sciame, Kiana Herr
 */

/**
   SKELETON
   SuperArray is a wrapper class for an array.

   Provides "pass-thru" accessibility to pre-existing array capabilities:
   - get/set by index
   - get length

   Adds functionality:
   - dynamic capacity
   - auto-grow capacity if necessary
*/

import java.io.*;
import java.util.*;

public class SuperArray
{
  /**
     SUBGOAL:
     declare instance vars
     ...and initialize?
  */


  //instance vars
  private int[] data;           // "interior"/"underlying" data container
  private int numberElements;   // number of "meaningful" elements


  // ~~~~~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~~~~~
  //overloaded constructor -- allows specification of initial capacity
  public SuperArray( int size )
  {
    //init underlying/inner storage of specified capacity
    this.data = new int[size];

    //init instance vars
    this.numberElements = 0;

  }

  //default constructor -- initializes capacity to 10
  public SuperArray()
  {
    //init underlying/inner storage of capacity 10
      this.data = new int[10];

    //init instance vars
      this.numberElements = 0;
  }


  // ~~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~
  public void print(){
    for (int i = 0; i < this.numberElements; i++){
      System.out.print(this.data[i] + " ");
    }
    System.out.println();
  }
  
  public void add( int value )
  {
    // test to see if we need to grow, then grow
    if (numberElements == this.data.length){
      this.grow();
      // int[] newData = new int[numberElements + 5];
      // for (int i = 0; i<numberElements; i++){
      //   newData[i] = this.data[i];
      // }
      // this.data = newData;
    }
    

    // add item and then increment numberElements
    this.data[numberElements++] = value;
//The ++ after numberElements means it evaluates first, then increments
    //If you wanted it to increment forst (which we don't in this situation) you could put:
    //++numberElements
    
    // increment numberElements
    // numberElements ++;
  }//end add()


  public boolean isEmpty()
  {
    //return whether this SuperArray instance is empty
    return (numberElements == 0);
  }


  public int get(int index)
  {
    //return item at index
    return this.data[index];
  }


  public String toString()
  {
    //return stringified version of this Object
    String s = "";
    for (int i = 0; i < this.numberElements; i++){
      s += (this.data[i] + " ");
    }
    return s;
  }//end toString()


  //return Stringified version of this Object,
  // with extra debugging info
  //(helper method for debugging/development phase)
  public String debug()
  {
    String s = "";
    s = "Size: " + this.data.length;
    s = s + " LastItem: " + numberElements + "  Data: ";
    for (int i = 0; i < numberElements; i++) {
      s = s + data[i] + ", ";
    }
    s = s + "\n";
    return s;
  }//end debug()


  public void remove(int index)
  {
    if(index >= numberElements|| index < 0){
      System.out.println("Cannot remove beyond the size of the array. Array is unchanged.");
      return;
    }
    // shift items down to remove the item at index
    for(int i = index; i < numberElements-1; i++){
      this.data[i] = this.data[i+1];
    }
    //Note that the last piece of data doesn't get overwritten (so that spot in memory might still be storing a value) but since we decrement numberElements it is no longer counted as data in our array

    // subtract fom numElements;
    numberElements --;
  }


  public void add(int index, int value)
  {
    // see if there's enough room
    if(index > numberElements || index < 0){
      System.out.println("Cannot add beyond the size of the array. Array is unchanged.");
      return;
    }
    if(numberElements == this.data.length){
      this.grow();
    }

    // shift elements toward the end of the array
    for(int i = numberElements; i > index; i--){
      this.data[i] = this.data[i-1];
    }

    // insert new element
    this.data[index] = value;

    // increment numElements
    numberElements ++;

    //Q: Should a user be allowed to insert an element beyond the indices of used elements?
  }

  public void replace(int index, int value){
    if(index > numberElements || index < 0){
      System.out.println("Cannot edit beyond the size of the array. Array is unchanged.");
      return;
    }
    this.data[index] = value;
  }
 

  private void grow()
  {
    //note that this is a private method since it is used as a helper method for our other methods
    // create a new array with extra space
    // Q: How did you decide how much to increase capacity by?
    int newData[] = new int[numberElements + 10];

    // copy over all the elements from the old array to the new one
    for (int i=0; i<numberElements; i++){
      newData[i] = this.data[i];
    }

    // point data to the new array
    // Q: How does this look when illustrated using encapsulation diagram?
    this.data = newData;
  }//end grow()

}//end class