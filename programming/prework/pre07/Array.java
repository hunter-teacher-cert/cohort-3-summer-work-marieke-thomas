import java.io.*;
import java.util.*;

public class Array{
  public static void main(String[] args){
    //Testing the powArray method
    double[] a = new double[10];
    for (int i = 0; i<10; i++){
      a[i] = i;
    }
    System.out.println(Arrays.toString(a));
    
    double[] b = new double[10];
    b = powArray(a, 3);
    System.out.println(Arrays.toString(b));

    //Testing the histogram method
    //First generate an array with 100 values that range from 0 to 8
    int[] scores = new int[100];
    for (int i = 0; i<100; i++){
      scores[i] = i%9;
    }
    System.out.println(Arrays.toString(scores));

    int[] scoresHist = new int[100];
    scoresHist = histogram(scores, 10);
    System.out.println(Arrays.toString(scoresHist));
  }
  
  public static double[] powArray(double[] a, int n){
    double[] powered = new double[a.length];
    for (int i = 0; i < a.length; i++) {
        powered[i] = Math.pow(a[i], n);
    }
    return powered;
  }

  public static int[] histogram(int[] scores, int num){
    int[] counts = new int[num];
    for (int score : scores) {
        counts[score]++;
    }
    return counts;
  }
}