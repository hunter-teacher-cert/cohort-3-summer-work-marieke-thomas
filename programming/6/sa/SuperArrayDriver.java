import java.io.*;
import java.util.*;

public class SuperArrayDriver
{
  public static void main( String[] args )
  {
    
    System.out.println("Testing default constructor.");
    SuperArray sa = new SuperArray();

    System.out.println("Testing empty print:");
    System.out.println(sa);
    System.out.println("Testing isEmpty (should be true)");
    System.out.println(sa.isEmpty());

    SuperArray sa2 = new SuperArray(8);
    //sa2.data[7] = 15;
    sa2.print();
    sa2.add(3);
    sa2.add(50402);
    sa2.add(14);
    sa2.print();

    // -----------------------------------------------------------
    // YOUR HOMEGROWN/HOUSEMADE/ROLL-YOUR-OWN TEST METHODS HERE...



    //precondition: newly-instantiated SuperArray of default capacity
    System.out.println("Testing overfill (calling grow() in add)");
    for (int i=0; i<15; i++) {
      sa.add(i);
    }//for i
    System.out.println(sa);
    //sa.print();
    System.out.println(sa.isEmpty());

    System.out.println("Testing get method");
    System.out.println(sa.get(7));

    System.out.println("\nTesting add at index 5, 0 and 17(end)");
    sa.add(5, 100);
    System.out.println(sa);
    sa.add(0, 100);
    System.out.println(sa);
    sa.add(17, 100);
    System.out.println(sa);

    //Testing that an error message is printed if we try to add outside the length of the array
    sa.add(50, 100);

    System.out.println("\nTesting remove at 0, 5, and 15 (end)");
    sa.remove(0);
    System.out.println(sa);

    sa.remove(5);
    System.out.println(sa);

    sa.remove(15);
    System.out.println(sa);

    //Testing the replace function
    System.out.println("\nTesting replace at 5 and 9");
    sa.replace(5, 92);
    System.out.println(sa);
    sa.replace(9, -3);
    System.out.println(sa);
  }//main

}//class SuperArrayDriver