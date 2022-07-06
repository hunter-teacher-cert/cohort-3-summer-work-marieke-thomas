import java.io.*;
import java.util.*;

/**
 * Conway's Game of Life by Team AreWeSentientYet?
 * Marieke Thomas
 * collaborators: Latoya Boland, Sam Lojacono, Erwin Lara
 */

/**
   The Rules of Life:
   Survivals:
   * A living cell with 2 or 3 living neighbours will survive for the next generation.
   Deaths:
   * Each cell with >3 neighbours will die from overpopulation.
   * Every cell with <2 neighbours will die from isolation.
   Births:
   * Each dead cell adjacent to exactly 3 living neighbours is a birth cell. It will come alive next generation.
   NOTA BENE:  All births and deaths occur simultaneously. Together, they constitute a single generation.
*/

public class Cgol
{

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


  public static void main( String[] args )
  {
    
    char[][] board;
    //board = createNewBoard(25,25);
    board = createNewBoard(5,5);
    //breathe life into some cells:
    setCell(board, 0, 0, 'X');
    setCell(board, 0, 1, 'X');
    setCell(board, 0, 2, 'X');
    Scanner in = new Scanner(System.in);
    // TASK:
    // Once your initial version is running,
    // try out different starting configurations of living cells...
    // (Feel free to comment out the above three lines.)
    System.out.println("Gen X:");
    printBoard(board);
    System.out.println("--------------------------\n\n");
    board = generateNextBoard(board);
    System.out.println("Gen X+1:");
    printBoard(board);
    System.out.println("--------------------------\n\n");

    //test countNeighbors
    // System.out.println(countNeighbours(board, 1, 1));
    //test getNextGenCell
    // System.out.println(getNextGenCell(board, 1,1));
    // System.out.println(getNextGenCell(board, 4,4));
    
  }//end main()

}//end class


/*Extensions:
1) Have it begin to randomly choose cells to birth and then have it determine who lives/dies after every turn
2) While loop for each generation
3) Animate!
*/