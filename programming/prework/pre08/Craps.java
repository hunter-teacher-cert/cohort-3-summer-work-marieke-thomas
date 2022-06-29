import java.io.*;
import java.util.*;

public class Craps{
  public static void main(String[] args){
    int wins = 0;
    int loses = 0;
    System.out.print("How many rounds of craps would you like to play? ");
    int numRounds = getNumber();
    for (int i=0; i<numRounds; i++){
      System.out.println("***********");
      System.out.println("ROUND NUMBER " + (i+1));
      boolean isWin = round();
      if (isWin){
        System.out.println("You won the round!");
        wins ++;
      } else {
        System.out.println("Sorry, you lost the round :(");
        loses ++;
      }
    }
    System.out.println("***********");
    System.out.print("You won " + wins + " rounds and lost " + loses + " rounds. ");
    if (wins > loses){
      System.out.println("Great job! What an impressive display of craps skill.");
    } else {
      System.out.println("Better luck next time.");
    }
  }
  public static int roll(int x){
    Random random = new Random();
    int number = random.nextInt(x) + 1;
    System.out.println("You rolled a " + number);
    return number;
  }

  public static int shoot(int numDice, int max){
    int total = 0;
    for (int i = 0; i < numDice; i++){
      total += roll(max);
    }
    System.out.println("Your total is " + total);
    System.out.println();
    return total;
  }

  public static boolean round(){
    int shot = shoot(2,6);
    if (shot == 2 || shot == 3 || shot ==12){
      System.out.println("Oh craps!");
      return false;
    } else if (shot ==7 || shot ==11){
      System.out.println("You're a natural!");
      return true;
    } else{
      System.out.println("The Point is " + shot + ". See if you can repeat it before rolling a 7.");
      while (true){
        int newShot = shoot(2,6);
        if (newShot == shot){
          return true;
        } else if (newShot == 7){
          return false;
        }
      }
    }
  }

  public static int getNumber(){
    Scanner in = new Scanner(System.in);
    while (!in.hasNextInt()){
      String skip = in.next();
      System.out.print("How many rounds of craps would you like to play? Make sure to enter a number. ");
    }
    return in.nextInt();
  }
}