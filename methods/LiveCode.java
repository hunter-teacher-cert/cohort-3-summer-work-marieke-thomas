//The4Loops

// PROVIDE :: code snippets or comments you definitely want to provide

import java.io.*;
import java.util.*;

public class LiveCode{

  //This method should search through "data" and return the index of the first time "value" appears in "data."
  //If "value" is not in "data" return -1.
  public static void main(String[] args){
    ArrayList<Integer> myAL = new ArrayList<Integer>();
    myAL.add(5);
    myAL.add(7);
    myAL.add(9);

    int indexOf5 = linearSearch(5);
    System.out.println("5 is at index " + indexOf5);

    int indexOf6 = linearSearch(6);
    System.out.println("6 is at index " + indexOf6);
  }
  
  public int linearSearch(int value, ArrayList<Integer> data) 
  {

  }

}



//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

//COMPLETED CODE
// PROVIDE
import java.io.*;
import java.util.*;

public class LiveCode{
  // PROVIDE
  //Uncomment this to test your method
  public static void main(String[] args){
    ArrayList<Integer> myAL = new ArrayList<Integer>();
    myAL.add(5);
    myAL.add(7);
    myAL.add(9);

    int indexOf5 = linearSearch(5);
    System.out.println("The 5 is at index " + indexOf5);

    int indexOf6 = linearSearch(6);
    System.out.println("The 6 is at index " + indexOf6);
  }

  //This method should search through "data" and return the index of the first time "value" appears in "data."
  //If "value" is not in "data" return -1.

  //Method that takes in an integer called value and an arrayList of integers called data and produces an integer
  //STUDENT-PROMPT
  //what is the return type?
  //what are the types of the parameters?
  //What is an ArrayList? How is it different from an Array?
  public int linearSearch(int value, ArrayList<Integer> data) 
  {

    int foundIndex = -1; //Variable foundIndex holds a default value of -1 (which is what will be returned if the value isn't in the data)
    
    //traverses ArrayList, stops at the end
    //DELIBERATE ERROR data.length instead of data.size()
    //MUST-ANSWER-Q How do we write the exit condition to iterate through the entire ArrayList?
    for (int i=0; i < data.size(); i++)
    {
      //holds the value of the element at index i
      //MUST-ANSWER-Q How do we acces the element at index i in an ArrayList?
      int element = data.get(i);

      //STUDENT-PROMPT What is the condition we're looking for?
      if (element == value) //if we find the value we are searching for
      {
        //set value of foundIndex to current index
        foundIndex = i;
        //exit loop
        break; //STUDENT-PROMPT What would happen if we didn't include the break? (If there are multiple copies of value, it will update and give us the index of the last time the value occurs instead of the first time)
        }
      }
    return foundIndex;
  }
}

//BIG IDEA: Array List methods-- the difference in how to access information in an array list compared to a regular array.