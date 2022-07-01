/**
 * Game of Nim by Team BossCoders
 * Marieke Thomas
 * collaborators: Joel Biachi, Joshua Higgins, Moo Joon Park, Rachel Kaufman
 */

import java.io.*;
import java.util.*;

public class Nim{
  public static void main(String[] args){
    int stones = 12;
    int stonesTaken;
    boolean over = false;
    Scanner input = new Scanner(System.in);

    //loop until the game ends
    while(over == false){
      //prompt user for input
      System.out.println("How many stones would you like to remove?");
      stonesTaken = input.nextInt();
      input.nextLine();
      //calculate stones remaining
      stones = stones - stonesTaken;
      //check for win and print for user
      if (stones ==0){
        over = true;
        System.out.println("You won the game!");
        break;
      } else {
        System.out.printf("There are %d stones remaining.", stones);
        System.out.println();
      }
      //machine turn
      if (stones <= 3){
        stonesTaken = stones;
      } else{
      Random random = new Random();
      stonesTaken = random.nextInt(3) +1;
      }
      System.out.println("Computer takes " + stonesTaken + " stones!");
      stones -= stonesTaken;
      //calculate stones remaining
      System.out.printf("There are %d stones remaining. ", stones);
      //check for win
      if (stones ==0){
        over = true;
        System.out.println("You lost");
        break;
      }
     }
  }
}
