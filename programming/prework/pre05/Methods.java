import java.io.*;
import java.util.*;

public class Methods{
  public static void main(String[] args){
    System.out.println(ack(3,2));
  }

  /**Takes two integers, n and m, and that returns true if n is divisible by m, and false otherwise.
@param n the integer number being divided
@param m the integer divisor
@return true if n is divisible by m, false otherwise
*/
  public static boolean isDivisible(int n, int m){
    return (n%m==0);
  }

  /**takes three integers as arguments and returns either true or false, depending on whether you can or cannot form a triangle from sticks with the given lengths.
@param a One of the integer side lengths
@param b One of the integer side lengths
@param c One of the integer side lengths
@return true if a triangle can be formed from sticks of length a, b, and c; false otherwise
  */
  public static boolean isTriangle(int a, int b, int c){
    return (a <= b + c && b <= a + c && c <= a + b);
  }

  /**Computes the value of the Ackermann function for two integer inputs
@param m First nonnegative integer input
@param n Second nonnegative integer input
@return The integer value of the Ackermann function for the two inputs
  */
  public static int ack(int m, int n){
    if (m == 0){
      return n + 1;
    }
    else if (n == 0){
      return ack(m-1, 1);
    }
    else {
      return ack(m-1, ack(m, n-1));
    }
  }
}


