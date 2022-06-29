import java.io.*;
import java.util.*;

public class Sieve{
  public static void main(String[] args){
    System.out.println(Arrays.toString(sieve(20)));
  }
  public static boolean[] sieve(int n){
    boolean[] isPrime = new boolean[n];
    for (int i=0; i<n; i++){
      isPrime[i] = true;
    }
    isPrime[0] = false;
    isPrime[1] = false;
    int limit = (int)Math.sqrt(n) + 1;
    for (int i=2; i<limit; i++){
      if (isPrime[i]){
        for (int j = i*i; j<n; j += i){
          isPrime[j] = false;
        }
      }
    }
    return isPrime;
  }
}