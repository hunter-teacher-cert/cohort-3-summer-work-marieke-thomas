import java.io.*;
import java.util.*;

public class Pointers3{
  public static void main(String[] args){
    Node p = new Node("5");
    p.setNext(new Node("10"));
    p.getNext().setNext(new Node("15", new Node ("20")));

    System.out.println("Checking the setup values");
    System.out.println(p.getData()); //5
    System.out.println(p.getNext().getData()); //10
    System.out.println(p.getNext().getNext().getData()); //15
    System.out.println(p.getNext().getNext().getNext().getData()); //20

    Node p2 = p.getNext();
    Node newP = new Node("30");
    newP.setNext(p2.getNext());
    p2.setNext(newP);

    System.out.println("Checking the final values");
    System.out.println(p.getData()); //5
    System.out.println(p.getNext().getData()); //10
    System.out.println(p.getNext().getNext().getData()); //30
    System.out.println(p.getNext().getNext().getNext().getData()); //15
    System.out.println(p.getNext().getNext().getNext().getNext().getData()); //15

  }
}