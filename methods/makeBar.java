//`barGraphify(int[] nums)` 
// if x=[0,1,2,3] then barGraphify(x) will output
// 0:
// 1: =
// 2: ==
// 3: ===

// if x=[1,0,3,2] then barGraphify(x) will output
// 0: =
// 1:
// 2: ===
// 3: ==

public class makeBar{
  public static String[] barGraphify(int[] nums){
    String[] barArray = new String[nums.length];
    String bar = "";
    for (int i = 0; i<nums.length; i++){
      //iterate through the array
      // how to get the exact number of bars 
      for (int h = 0; h < nums[i]; h++){
        // set the bars
        bar += "=";
      }
      // create the element in barArray
      barArray[i] = bar;
      bar = "";
    }
    return barArray;
  }

  public static char[][] vBarGraphify(int[] nums){
    //Find the max value in the array and add 1 to get the height of the graph
    int height = 0;
    for (int i : nums){
      if (nums[i] > height){
        height = nums[i];
      }
    }
    height ++;

    //create empty 2D array
    char[][] result = new char[height][nums.length];
    //fill all squares with spaces
    for (int g = 0; g < height; g++) {
        for (int j = 0; j < nums.length; j++) {
          result[g][j]=' ';
        }
      }

    //iterate through all the numbers in the array. Print the bottom row with the index and fill in that column with as many *s as the value of the number in the array
    for (int i = 0; i < nums.length; i++){
      char c=(char)(i + '0');
      result[height-1][i] = c; //bottom row

      //fill in the *s, moving upwards
      int row = height-2;
      for (int j=0; j<nums[i]; j++){
        result[row][i] = '*';
        row --;
      }
    }
    
    return result;
  } 

  public static void printBoard( char[][] board )
    {
      for (int i=0; i < board.length; i++){
        for (int j = 0; j < board[0].length; j++){
          System.out.print(board[i][j] + " ");
        }
        System.out.println();
      }
    }
  
  public static void main(String[] args){
     int[] x = new int[] {1,0,3,2};
    // String[] result = barGraphify(x);
    // for (int i = 0; i < result.length; i++){
    //   System.out.println(i + ": " + result[i]);
    // }
    //System.out.println();
    char[][] vGraph = vBarGraphify(x);
    printBoard(vGraph);
  }
}

//alternate version that returns a string rather than an array
// public class makeBar{
//   public static String barGraphify(int[] nums){
//     String bar = "";
//     for (int i = 0; i<nums.length; i++){
//       //set the bar string to have the indices 
//       bar += i + ": ";
//       // how to get the exact number of bars 
//       for (int h = 0; h < nums[i]; h++){
//         // set the bars
//         bar += "=";
//       }
//       // add new line character to bar
//       bar += "\n";
//     }
//     return bar;
//   }

//   public static void main(String[] args){
//     int[] x = new int[] {1,0,3,2};
//     String result = barGraphify(x);
//     System.out.println(result);
//   }
// }