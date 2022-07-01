import java.io.*;
import java.util.*;

public class ArrayNotes{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    //If you don't know how big an array will be, just choose a much-larger-than-necessary number
    String myFriends[] = new String[1000];
    System.out.println("Type the names of your closest friends. Press \"enter\" after each one. Type \"stop\" when you are finished.");
    int numFriends = 0;
    String friend = input.nextLine();
    while (!friend.toLowerCase().equals("stop")){
      myFriends[numFriends] = friend;
      numFriends++;
      friend = input.nextLine();
    }

    //System.out.println(numFriends);
    
    //Code to delete the nth item in the list
    numFriends = deleteFromArray(2, numFriends, myFriends);
    //You could clear the last item if you want by replacing it with "" if you go up to numFriends instead of (numFriends-1) but it's not necessary-- as long as you decrement numFriends, that nth item is not seen anyway.

    //check that it worked by printing the array
    for (int j = 0; j < numFriends; j++){
      System.out.print(myFriends[j] + ", ");
    }
    System.out.println();

    
    printArray(someData);
    printPartialArray(someData, 3);
  }
  
  public static int deleteFromArray(int n, int numFriends, String[] myFriends){  
    for (int i = n; i < numFriends-1; i++){
      myFriends[i] = myFriends[i+1];
    }
    numFriends --;
    return numFriends;
  }

  static int[] someData = new int[] {45, 23, 78, 99, 12};
  //printing for an array that is completely filled
  public static void printArray(int[] data){
    for (int i = 0; i < data.length; i++){
      System.out.print(data[i] + " ");
    }
    System.out.println();
  }

  //printing for an array that is partially filled
  public static void printPartialArray(int[] data, int currSize){
    for (int i = 0; i < currSize; i++){
      System.out.print(data[i] + " ");
    }
    System.out.println();
  }
}
  

  