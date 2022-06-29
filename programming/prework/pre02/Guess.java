import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Guess {

    public static void main(String[] args) {
      int guess;  
      
      // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
      Scanner in = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1 and 100, inclusive. Can you guess my number?");
      System.out.print("Type a number: ");
      guess = in.nextInt();
      in.nextLine();
      System.out.println("You guessed: " + guess);
      System.out.println("My number was: " + number);
      System.out.println("You were off by: " + Math.abs((guess - number)));
    }
}