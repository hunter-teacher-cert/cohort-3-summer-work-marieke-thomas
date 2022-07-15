import java.util.ArrayList;
public class Test{
  public static void main(String[] args){
    ArrayList<String> words = new ArrayList<String>(); //default constructor (has a capacity of 10)
    ArrayList<String> words2 = new ArrayList<String>(15); //constructs a new array with a size of 15
    ArrayList<Integer> numbers = new ArrayList<Integer>; //makes an ArrayList that stores numbers instead of strings. You have to use the Integer object rather than the integer primitive class

    //adding
    words.add("fish");//line 16 changes this to notFish
    //somethingelse>> //line 11 inserts somethingelse
    words.add("fish2");
    words.add("fish3");
    words.add(1,"somethingelse");

    System.out.println(words);

    System.out.println(words.get(0));
    words.set(0,"notFish");
    words.add("anotherNotFish");
    System.out.println(words.get(0));
    System.out.println(words);
    //size()-1 is the index of the last element
    System.out.println(words.get( words.size()-1 ));
  }
}

//adding at the end is generally faster than adding at an index b/c when you add at an index you have to shift everything over which is more time-consuming