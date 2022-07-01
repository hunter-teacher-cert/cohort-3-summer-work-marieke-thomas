import java.io.*;
import java.util.*;

public class StringNotes{
  public static void main(String[] args){
    
    //printing a string backwards
    String a = "heels";
    for (int i = a.length()-1; i >=0; i--){
      System.out.print(a.charAt(i));
    }
    System.out.println();

    //Converts all characters to upper case
    String b = "";
    for (int i = 0; i< a.length(); i++){
      char letter = a.charAt(i);
      int letterCode = (int) letter;
      if (letterCode < 123 && letterCode > 96){
        letterCode -= 32;
      }
      b = b+ (char) letterCode;
    }
    System.out.println(b);

    //Prints out the second word of a sentence written
    Scanner input = new Scanner(System.in);
    String sentence = "This is a sentence.";
    // sentence = "In Oklahoma, the wind comes sweeping o'er the plains";
    System.out.println("Type a sentence that is at least 3 words.");
    sentence = input.nextLine();
    boolean firstSpace = false;
    boolean secondSpace = false;
    int i = 0;
    while(sentence.charAt(i) != ' '){
      i++;
    }
    while(sentence.charAt(i) == ' '){
      i++;
    }
    while(sentence.charAt(i) != ' '){
      System.out.print(sentence.charAt(i));
      i++;
    }    
  }
}

  