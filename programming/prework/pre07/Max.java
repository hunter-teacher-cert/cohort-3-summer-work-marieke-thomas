import java.io.*;
import java.util.*;

public class Max{
  public static int indexOfMax(int[] a){
    int max = a[0];
    int maxIndex = 0;
    for (int i = 0; i<a.length; i++){
      if (a[i]>max){
        max = a[i];
        maxIndex = i;
      }
    }
    return maxIndex;
  }
  
  public static void main(String[] args){
    int[] a = new int[10];
    for (int i = 1; i<10; i++){
      a[i] = i%7;
    }
    System.out.println(Arrays.toString(a));

    int b;
    b = indexOfMax(a);
    System.out.println(b);
  }
}

//This method cannot use an enhanced for loop (or at least, not without adding a counter that would defeat the point of the enhanced for loop) because it is necessary to know the index of each value