/**
 * Binary Search by Team Did You Mean Recursion?
 * Marieke Thomas
 * collaborators: Kate Maschmeyer, Alicia Wade, Moo Joon Park
 */

/**
   class BinSearch
   Binary search on array of ints
*/

public class BinSearch
{

  /**
     int binSearch(int[],int) -- searches an array of ints for target int
     precondition:  input array is sorted in ascending order
     postcondition: returns index of target, or returns -1 if target not found
  */
  public static int binSearch ( int[] a, int target )
  {
    //Q: Why did the designers of this class opt for 2 binSearch methods instead of 1?
    //A: So that the original function call only needs 2 inputs, making it shorter to type in. The low and high position are know based on the length of the array so it would be unnecessarily tedious to make the user type them in
    //return binSearchRec( /* YOUR SMART CODE HERE */ );
    return binSearchRec( a, target, 0, a.length-1 );
  }


  public static int binSearchRec( int[] a, int target, int lo, int hi )
  {
    int tPos = -1; //init return var to flag/signal value

    int mPos = (lo + hi) / 2; //init tracker var for middle position

    //System.out.println("Searching for " + target + " from "+ lo + " to " + hi + " at position " + mPos);
    
    //exit case. If lo & hi have crossed, target not present
    if (lo>hi){
      //System.out.println("Not here");
      return -1;
    }

    // target found
    if (a[mPos] == target) {
      //System.out.println("found it");
      return mPos;
    }
    // value at mid index higher than target
    else if (a[mPos] > target) {
      return binSearchRec(a, target, lo, mPos-1);
    }
    // value at mid index lower than target
    else if (a[mPos]<target) {
      return binSearchRec(a, target, mPos+1, hi);
    }

    return tPos;
  }//end binSearchRec


  //tell whether an array is sorted in ascending order
  private static boolean isSorted( int[] arr )
  {
    boolean retBoo = true; //init to true, assume array is sorted

    //Q: Why would a FOREACH loop not suffice here?
    for( int i=0; i < arr.length-1; i++ ) {
      if ( ( arr[i] > arr[i+1] ) ) {
        return false;
      }
    }
    return retBoo; //if entire array was traversed, it must be sorted
  }


  // utility/helper fxn to display contents of an array of Objects
  private static void printArray( int[] arr )
  {
    String output = "[ ";

    for( int c : arr )
      output += c + ", ";

    output = output.substring( 0, output.length()-2 ) + " ]"; //get rid of last comma and add ]

    System.out.println( output );
  }



  //main method for testing
  public static void main ( String[] args )
  {
    //move the bar down to uncover tests in succession...
    


    //Declare and initialize array of ints
    int[] iArr = { 2, 4, 6, 8, 6, 42 };
    printArray( iArr );
    System.out.println( "iArr1 sorted? -- " + isSorted(iArr) );

    int[] iArr2 = { 2, 4, 6, 8, 13, 42 };
    printArray( iArr2 );
    System.out.println( "iArr2 sorted? -- " + isSorted(iArr2) );

    int[] iArr3 = new int[10000];
    for( int i = 0; i < iArr3.length; i++ ) {
      iArr3[i] = i * 2;
    }

    //Added an example of an array with an odd number of ints
    int[] iArr4 = {1, 3, 6, 7, 20};
    System.out.print("iArr4: ");
    printArray(iArr4);

    //printArray( iArr3 );
    System.out.println( "iArr3 sorted? -- " + isSorted(iArr3) );

    System.out.println( "now testing binSearch on iArr2..." );
    System.out.println( binSearch(iArr2,2) );
    System.out.println( binSearch(iArr2,4) );
    System.out.println( binSearch(iArr2,6) );
    System.out.println( binSearch(iArr2,8) );
    System.out.println( binSearch(iArr2,13) );
    System.out.println( binSearch(iArr2,42) );

    
    //search for 43 in array
    System.out.println( binSearch(iArr2,43) );

    System.out.println( "now testing binSearch on iArr3..." );
    System.out.println( binSearch(iArr3,4) );
    System.out.println( binSearch(iArr3,8) );
    System.out.println( binSearch(iArr3,5) );

    //search for 43 in array
    System.out.println( binSearch(iArr3,43) );
    
    System.out.println( "now testing binSearch on iArr4..." );
    System.out.println(binSearch(iArr4,7));
    System.out.println(binSearch(iArr4,6));
    System.out.println(binSearch(iArr4,1));
    System.out.println(binSearch(iArr4,9));
  }
}