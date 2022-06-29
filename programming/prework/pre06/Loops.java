import java.io.*;
import java.util.*;

public class Loops{
  public static void main(String[] args) {
    System.out.println("The square root of 103 is about " + squareRoot(103));
    System.out.println("3 raised to the 4th power is " + power(3,4));
    System.out.println("Ten factorial is " + factorial(10));
  }

  public static double squareRoot(double a) {
    double x = a/2;
    double diff = 1;
    double newX = 0;
    while (diff >= 0.0001){
      newX = (x+a/x)/2;
      diff = Math.abs(x-newX);
      x = newX;
    }
    return x;
  }

  public static double power(double x, int n){
    double answer = 1;
    for (int i = 0; i<n; i++){
      answer = answer*x;
    }
    return answer;
  }

  public static int factorial(int n){
    int result = 1;
    if (n==0){
      return 1;
    } else{
      while (n > 1){
        result = result * n;
        n --;
      }
      return result;
    }
  }
}