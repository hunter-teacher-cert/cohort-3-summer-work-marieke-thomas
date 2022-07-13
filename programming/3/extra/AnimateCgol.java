/**
   DEMO
   animation in the terminal
   USAGE:
   Make this file your own, and comment liberally as you explore...
   Then use as basis for animating whatever you like. (Make a copy, rename, copy/paste, etc)
   WORKFLOW:
   Read for understanding.
   Skim over delay(). Focus on animate() and main().
   Jot down / discuss predictions of what you will see when you run it.
   Run.
   Reconcile expectation with observation.
*/

import java.io.*;
import java.util.*;

public class AnimateCgol
{

  // pause for n milliseconds
  public static void delay(int n)
  {
    try {
      Thread.sleep(n);
    }
    catch(InterruptedException e) {}
  }


  // "repaint" by using an ANSI control character to
  // repeatedly place the cursor at the origin (upper left)
  public static char[][] animate(int n, char[][] animateBoard, int generation)
  {
    //clear screen, place cursor at origin (upper left)
    System.out.print("[0;0H\n");

    // After you have predicted/observed/reconciled
    // behavior of the preceding line,
    // comment it out,
    // uncomment the for loop below, and
    // re-apply your process.


    animateBoard = generateNextBoard(animateBoard);
    System.out.println("Gen " + generation + ":");
    printBoard(animateBoard);
    System.out.println("--------------------------\n\n");
    generation++;

    delay(200);
    return animateBoard;
  }


  // run 20 frames of animation
  public static void main( String[] args )
  {
    char[][] board;
    board = createNewBoard(15,10);
    setRandomBoard(board, 50);
    Scanner in = new Scanner(System.in);
    int generation = 0;

    for (int frame = 0; frame < 30; frame++) {
      board = animate(frame, board, generation);
      generation ++;
    }

  }//end main()

    //create, initialize, and return  empty board (all cells dead)
  public static char[][] createNewBoard( int rows, int cols )
  {
    char[][] board = new char[rows][cols];
    for(int i=0; i<board.length; i++){
      for(int j=0; j<board[0].length; j++){
        board[i][j] = ' ';
      }
    }
    return board;
  }


  //print the board to the terminal
  public static void printBoard( char[][] board )
  {
    for(int i=0; i<board.length; i++){
      for(int j=0; j<board[0].length; j++){
        if (board[i][j] == ' '){
          System.out.print(". ");
        } else {
          System.out.print(board[i][j] + " ");
        }
      }
      System.out.println();
    }
    System.out.println();
  }


  //set cell (r,c) to val
  public static void setCell( char[][] board, int r, int c, char val )
  {
    board[r][c] = val;
  }

  public static void setRandomBoard(char[][] board, int numCells){
    Random random = new Random();
    int randRow, randCol;
    int i = 0;
    while (i < numCells){
      randRow = random.nextInt(board.length);
      randCol = random.nextInt(board[0].length);
      if (board[randRow][randCol] != 'X'){
        setCell(board, randRow, randCol, 'X');
        i++;
      }
    }
  }


  //return number of living neigbours of board[r][c]
  public static int countNeighbours( char[][] board, int r, int c )
  {
    int count = 0;
    for (int i= Math.max(r -1,0); i< Math.min(r + 2, board.length); i++){
      for (int j = Math.max(c-1,0); j < Math.min(c + 2, board[r].length); j++){
        if(board[i][j]=='X'&& !(i==r && j==c)){
          count ++;
        }
      }
    }
    return count;
  }


  /**
     precond: given a board and a cell
     postcond: return next generation cell state based on CGOL rules
     (alive 'X', dead ' ')
  */
  public static char getNextGenCell( char[][] board,int r, int c )
  {
    int numNeighbors = countNeighbours(board, r, c);
    if (board[r][c] == 'X'){
      //currently alive
      if (numNeighbors == 3 || numNeighbors == 2){
        //stays alive
        return 'X';
      } else{
        //stays dead
        return ' ';
      }
    } else{
      //currently dead
      if (numNeighbors == 3){
        //comes alive
        return 'X';
      } else{
        //stays dead
        return ' ';
      }
    }
  }


  //generate and return a new board representing next generation
  public static char[][] generateNextBoard(char[][] board )
  {
    char[][] newBoard = new char[board.length][board[0].length];
    for (int i =0; i<board.length; i++){
      for (int j=0; j<board[0].length; j++){
        newBoard[i][j] = getNextGenCell(board, i, j);
      }
    }
    return newBoard;
  }
}//end class