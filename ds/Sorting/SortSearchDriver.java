import java.io.*;
import java.util.*;

public class SortSearchDriver {
  public static void main(String[] args) {


  	// Uncomment these to test part 1
  	int size = 100000;
  	SortSearch ss = new SortSearch(size);
  	//System.out.println(ss);
	
		long start,elapsed;

	
  	// Uncomment these to test part 2
  
  	int i;
  	i = ss.findSmallestIndex(0);
  	//System.out.println("ss["+ i +"] = "+ss.get(i)+" : " + ss);
  
  	i = ss.findSmallestIndex(10);
  	//System.out.println("ss["+ i + "] = "+ss.get(i)+" : " + ss);
  	
  	// Uncomment these to test part 3
  
  	//System.out.println(ss);
  	start = System.currentTimeMillis();
    ss.sort();
    elapsed = System.currentTimeMillis() - start;
	  //System.out.println(ss);
	  System.out.println("Size: " + size + " Time: " + elapsed);

    int searchResult;
    start = System.currentTimeMillis();
    searchResult = ss.linearSearch(18);
    elapsed = System.currentTimeMillis() - start;
	  //System.out.println(ss);
	  System.out.println("Linear Search: Size: " + size + " Time: " + elapsed);
    System.out.println("Found at position " + searchResult);

    start = System.currentTimeMillis();
    searchResult = ss.binarySearch(18);
    elapsed = System.currentTimeMillis() - start;
	  //System.out.println(ss);
	  System.out.println("Binary Search: Size: " + size + " Time: " + elapsed);
    System.out.println("Found at position " + searchResult);

    start = System.currentTimeMillis();
    ss.binarySearchRecursive(18,0,size-1);
    elapsed = System.currentTimeMillis() - start;
	  //System.out.println(ss);
	  System.out.println("Recursive binary Search: Size: " + size + " Time: " + elapsed);
    System.out.println("Found at position " + searchResult);

    data = new ArrayList<Integer>(1000000); // make it large
    for (int k = 0 ; k < 1000000; k++){
      data.add(k);
    }

    start = System.currentTimeMillis();
    searchResult = data.linearSearch(18);
    elapsed = System.currentTimeMillis() - start;
	  //System.out.println(ss);
	  System.out.println("Linear Search: Size: " + size + " Time: " + elapsed);
    System.out.println("Found at position " + searchResult);

    start = System.currentTimeMillis();
    searchResult = data.binarySearch(18);
    elapsed = System.currentTimeMillis() - start;
	  //System.out.println(ss);
	  System.out.println("Binary Search: Size: " + size + " Time: " + elapsed);
    System.out.println("Found at position " + searchResult);

    start = System.currentTimeMillis();
    data.binarySearchRecursive(18,0,size-1);
    elapsed = System.currentTimeMillis() - start;
	  //System.out.println(ss);
	  System.out.println("Recursive binary Search: Size: " + size + " Time: " + elapsed);
    System.out.println("Found at position " + searchResult);

      // System.out.println("Testing linear search");
      // System.out.println("Searching for 7. It's at " + ss.linearSearch(7));

      // System.out.println("Testing binary search");
      // System.out.println("Searching for 7. It's at " + ss.binarySearch(7));

      // System.out.println("Testing modified binary search");
      // System.out.println("Searching for 7. It's at " + ss.binarySearchGetFirst(7));

      // System.out.println("Testing recursive binary search");
      // System.out.println("Searching for 7. It's at " + ss.binarySearchRecursive(7,0,19));

    // for (int j = 0; j < 20; j++){
    //   System.out.println("Linear Search:");
    //   System.out.println(j + " is at position: " + ss.linearSearch(j));
    //   System.out.println("Binary Search:");
    //   System.out.println(j + " is at position: " + ss.binarySearch(j));
    //   System.out.println("Binary Search Recursive:");
    //   System.out.println(j + " is at position: " + ss.binarySearchRecursive(j,0,19));
    //   System.out.println("");
    // }

      //Can search for value at a position you know (One caveat that if the value is in the list multiple times, you might return a different # than you put in. So if your list is [0, 0, 1, 1, 2, 2, 11, 12, 12, 13, 13, 14, 14, 15, 16, 17, 18, 19, 19, 19] and you do ss.linearSearch(ss.get(5)) it's going to see that the value at index 5 is 2, then do a linear search for 2 and find it at index 4)
      // System.out.println(ss.linearSearch(ss.get(17)));

      

	
	
	// printing is really slow so we don't want
	// to print when testing time. 
		

	
			   

    }
}