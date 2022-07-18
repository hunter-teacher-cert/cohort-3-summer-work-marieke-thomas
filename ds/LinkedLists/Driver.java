import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();

    l.add("Is it Cake");
    l.add("Top Chef");
    l.add("Great British Bake-off");
    System.out.println(l);
    System.out.println(l.get(0));
    System.out.println(l.get(2));

    System.out.println(l.size());
    l.add("Foooood");
    System.out.println(l.size());
    l.add(2,"some show");
    System.out.println(l);
    l.add(0, "beginning");

    l.add(6,"end");
    System.out.println(l);
  }
}