//Prereqs: Students are familiar with creating a variable, storing something it it temporarily, and reassigning a new value to it. Students are in the middle of learning about 1D arrays so they have done some practice but it is still a concept that they are working on solidifying. Students have written a printArray method.

import java.util.*;
import java.io.*;

public class 02_livecode_java
{
/**
     Parameters:
     data - an array of integers
     Returns:
     no return value since this is a void function -- but
     you will manipulate the values in the array parameter
     Postcondition:
     elements of the input array are in reverse order
     Example:
     If the input array contains 5,8,13,7,27,2
     After the routine, the array will contain 2,27,7,13,8,5
  */
  public static void flip( int[] data )
  {
    //Without showing any code, show working version that flips an array
    //Student-Prompt //I want the last piece of data to become the first (in the example, I want the 2 to become first). Let's try that:
    //FIRST_DRAFT
    // data[0] = data[data.length-1];
    // printArray(data);
    //What do you notice? What is it doing? (The 5 gets overwritten with a 2)
    //Why is this a problem?
    //We can't put the original first number in the last spot because we don't know what the original first number was anymore. It's been overwritten
    //MUST-ANSWER Q: How can we get around this problem of overwriting our data?
    //BIG IDEA: Store the original data in some sort of other variable to temporarily store data and then give it back to the user
    //FIRST-DRAFT
    //int[] placeholder  = new int[??];
    //Student-Prompt: How long should we make our placeholder array?
    //REVISION
    int[] placeholder  = new int[data.length];
    //We need to take every element in the list and put it into the placeholder list. How do we acces each element in the list? 
    //Student-Answer: use a for loop
    //we are using a for loop to traverse the list
    
    for (int i=0; i<data.length; i++){
      //Make chart of what array goes where for our example array which has 6 elements:
      //original index  Final index
      //0                5
      //1                4
      //2                3
      //3                2
      //etc
      //What do you notice about all these pairs? All add to 5. Why 5? That's the length -1.
      //DELIBERATE ERROR: Don't include the -1. Run the code to see what happens.
      placeholder[i] = data[data.length-i-1];//data.length-1 gives the last possible index. Subtracting i means the second index goes down while the first index goes up

    }

    //How do we put the reorganized information back into our original list?
    data = placeholder;
    printArray(data);
  }
}

    
    // // Alternate method that manipulates the global array (don't show to whole class but can use as an extension for advanced students)
    // int x = 0;
    // int end = data.length/2;
    // for (int i=0; i<end; i++){
    //   x = data[i];
    //   data[i] = data[(data.length-i)-1];
    //   data[(data.length-i)-1] = x;
    


//Provide:

// import java.util.*;
// import java.io.*;

// public class 02_livecode_java
// {
// /**
//      Parameters:
//      data - an array of integers
//      Returns:
//      no return value since this is a void function -- but
//      you will manipulate the values in the array parameter
//      Postcondition:
//      elements of the input array are in reverse order
//      Example:
//      If the input array contains 5,8,13,7,27,2
//      After the routine, the array will contain 2,27,7,13,8,5
//   */
//   public static void flip( int[] data )
//   {
    
//   }
// }
