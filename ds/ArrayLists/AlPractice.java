import java.io.*;
import java.util.*;

/** Methods to write

Basic level:
------------
public static ArrayList<Integer> buildRandomList(int size, int maxval)
public static int sumOfList(ArrayList<Integer> dataList)

Intermediate level:
-------------------
public static void swapElements(ArrayList<Integer> dataList, int indexA,int indexB)
public static void removeValue(ArrayList<Integer> dataList, int valueToRemove)

Challenge level:
-------------------
public static ArrayList<Integer> sumLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB)
public static ArrayList<Integer> zipLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB)
*/


public class AlPractice{

  /**
  Parameters:
  - size - an integer representing how many items to add to the list
  - maxval - the largest value to store in the list
  Preconditions:
  - size >= 0
  - maxVal > 0
  Returns:
  - A new ArrayList of Integers with each value being a random
    number between 0 and maxval (not including maxval).
  */
  public static ArrayList<Integer> buildRandomList(int size, int maxval){
    ArrayList<Integer> randomList = new ArrayList<Integer>(size);
    Random rand = new Random();
    for(int i = 0; i < size; i++){
      int x = rand.nextInt(maxval);
      randomList.add(x);
    }
    return randomList;
  }

  /**
  Parameters:
  - dataList - an ArrayList of integer values.
  Returns:
  - The sum of all of the elements of the ArrayList.
  */
  public static int sumOfList(ArrayList<Integer> dataList){
    int sum = 0;
    for (int i = 0; i < dataList.size(); i++){
      sum += dataList.get(i);
    }
    return sum;
  }

  /**
  Parameters:
  - dataList - an ArrayList of Integers
  - index1, index2 - the two locations to swap.
  Preconditions:
  - index1 and index2 are valid indecies of dataList
  Postconditions:
  - The ArrayList is modified such that
    The value that was in dataList[index1] is now in dataList[index2], and
    the value  that was in dataList[index2] is now in dataList[index1].
  - No other values should be modified.
  */
  public static void swapElements(ArrayList<Integer> dataList, int index1,int index2){
    int placeholder = dataList.get(index1);
    dataList.set(index1, dataList.get(index2));
    dataList.set(index2, placeholder);
  }

  /**
  Parameters:
  - dataList - an AraryList of Integers
  - valueToRemove - the value to remove
  Postconditions:
  - The dataList is modified such that all occurances of valueToRemove are removed.
  */
  public static void removeValue(ArrayList<Integer> dataList, int valueToRemove){
    for (int i = 0; i < dataList.size(); i++){
      if (dataList.get(i) == valueToRemove){
        dataList.remove(i);
        i--;
      }
    }

  }


  /**
  Parameters:
  - ListA,ListB - ArrayLists of integer values.
  Preconditions:
  - ListA and ListB have equal lengths.
  Returns:
  - A new ArrayList that contains the sum of the corresponding indecies of the two arraylists.
    e.g. sumLists( [1,2,3], [4,0,5]) would return: [5,2,8]
  Postconditions:
  - The parameter ArrayLists should not be modified.
  */
  public static ArrayList<Integer> sumLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB){
    ArrayList<Integer> sumList = new ArrayList<Integer>();
    for(int i=0; i<ListA.size(); i++){
      //Take the ith value from both lists and add them
      sumList.add(i, ListA.get(i) + ListB.get(i));
    }
    return sumList;
  }

  /** zipLists
  Parameters:
  - ListA,ListB - ArrayLists of integer values.
  Returns:
  - A new ArrayList that contains all of the elements from both ArrayLists in alternating order starting with ListA's first element.
    When one list has no more values to add, continue adding the remaining values of the longer list.
    e.g. zipLists( [1,2,3,4], [8,9]) would return: [1,8,2,9,3,4]
  Postconditions:
  - The parameter ArrayLists should not be modified.
  */
  public static ArrayList<Integer> zipLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB){
    ArrayList<Integer> ListC = new ArrayList<Integer>();
    int maxLength = Math.max(ListA.size(), ListB.size());
    for (int i = 0; i<maxLength; i++){
      if (i < ListA.size()){
        ListC.add(ListA.get(i));
      }
      if (i < ListB.size()){
        ListC.add(ListB.get(i));
      }
    }
    return ListC;//placeholder to compile.
  }




public static void main(String[] args) {

  ArrayList<Integer> al;

  //Uncomment these to test buildRandomList
  al = buildRandomList(10,100);
  System.out.println(al);

  System.out.println("The sum is " + sumOfList(al));

  //Uncomment these to test swapElements
  swapElements(al,2,6); // NOTE: had to include al
  System.out.println(al);

  // Uncomment these to test removeValue
  System.out.println("Adding 5s and testing removeValue to remove 5s");
  al.add(5);
  al.add(10);
  al.add(5);
  al.add(13);
  al.add(5);
  al.set(2,5);
  al.set(3,5);
  System.out.println(al);
  removeValue(al,5);
  System.out.println(al);

  //test sumLists
  ArrayList<Integer> list1 = new ArrayList<Integer>();
  list1.add(5);
  list1.add(27);
  list1.add(0);

  ArrayList<Integer> list2 = new ArrayList<Integer>();
  list2.add(9);
  list2.add(2);
  list2.add(4);

  ArrayList<Integer> list3 = sumLists(list1, list2);
  //prints [14, 29, 4]
  System.out.println(list3);

  //Test zipLists
  System.out.println("Testing zipLists");
  System.out.println(zipLists(list1, list2));
  System.out.println(zipLists(al, list1));
  System.out.println(zipLists(list1, al));
    
  }

}