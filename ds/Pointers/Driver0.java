import java.io.*;
import java.util.*;

public class Driver0{
  public static void main(String[] args){
    Node n1 = new Node("15");
    Node n2 = new Node("20");
    Node n3 = new Node("25");

    n1.setNext(n2);
    System.out.println("n1's next (n2)'s data: " + n1.getNext().getData()); //prints 20

    n2.setData("7");
    System.out.println("n1's next's data after resetting n2's value: " + n1.getNext().getData()); //prints 7

    n2 = n3;
    System.out.println("n1's next's data after reassigning n2: " + n1.getNext().getData()); //still prints 7, not 25


    System.out.println("n1 data: " + n1.getData());
    System.out.println("n3 data: " + n3.getData());

    //Checking resetting 
    n1 = n3;
    n3.setData("17");
    System.out.println("n1 data: " + n1.getData());//17
    System.out.println("n3 data: " + n3.getData());//17
    n1.setData("30");
    System.out.println("n1 data: " + n1.getData());//30
    System.out.println("n3 data: " + n3.getData()); //30
  }
}