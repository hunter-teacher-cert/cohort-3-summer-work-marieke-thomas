/**
 * Recursive String Reverser by Team Palindromotosis
 * Marieke Thomas
 * collaborators: Kate Maschmeyer, Alicia Wade, Moo Joon Park
 */


public class Reverser
{
  /**
     String reverseF(String) -- recursive String reverser
     precond:  input String is non-empty
     postcond: returns input String with chars in reverse order
  */
  public static String reverseR( String s )
  {
    String reversed = "";
    if (s.length() == 1){
      return s;
    } else{
      return s.charAt(s.length()-1) + reverseR(s.substring(0,s.length()-1));
    }
  }


  public static void main( String[] args )
  {
    System.out.println( reverseR("odd") );
    System.out.println( reverseR("even") );
    System.out.println( reverseR("abcdefg") );
    System.out.println( reverseR("stressed") );
    System.out.println( reverseR("amanaplanacanalPanama") );
System.out.println( reverseR("amanaplanacanalPanama".toLowerCase()) );
    //more tests welcome
    // got some good palindromes?
  }
}