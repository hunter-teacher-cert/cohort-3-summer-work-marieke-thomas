import java.io.*;
import java.util.*;

public class Beer{
  public static void main(String[] args){
    verse(99);
  }
  public static void verse(int num){
    if (num == 0){
      lastVerse();
    }
    else {
      String bottles;
      bottles = num == 1 ? "bottle" : "bottles";
      System.out.println(num + " " + bottles + " of beer on the wall,");
      System.out.println(num + " " + bottles + " of beer,");
      System.out.println("ya' take one down, ya' pass it around,");
      bottles = num == 2 ? "bottle" : "bottles";
      System.out.println((num-1) + " " + bottles + " of beer on the wall.");
      System.out.println();
      verse(num-1);
    }
  } 
  public static void lastVerse(){
    System.out.println("No bottles of beer on the wall,");
    System.out.println("No bottles of beer,");
    System.out.println("ya’ can’t take one down, ya’ can’t pass it around,");
    System.out.println("’cause there are no more bottles of beer on the wall!");
  }
}