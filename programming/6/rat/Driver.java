/**
 * class Driver
 * tester class for class Rational
 */

public class Driver
{
  public static void main( String[] args )
  {    
    Rational r = new Rational( 3, 7 );
    Rational s = new Rational();
    Rational t = new Rational( 8, 5 );

    Rational u = new Rational( 1, 2 );
    Rational v = new Rational( 2, 3 );
    Rational w = new Rational( 8, 12 );

    Rational x = new Rational( 8, 12 );
    Rational y = new Rational(3,0);

    System.out.println("r: " + r );
    System.out.println("s: " +  s );
    System.out.println("t: " +  t );
    System.out.println("y: " +  y );

      System.out.println( r + " as a floating pt approximation: "
      + r.floatValue() );
      System.out.println( s + " as a floating pt approximation: "
      + s.floatValue() );
      System.out.println( t + " as a floating pt approximation: "
      + t.floatValue() );

      System.out.print( r + " * " + t + " = ");
      r.multiply(t);
      System.out.println(r);
    
      System.out.print( r + " / " + t + " = ");
      r.divide(t);
      System.out.println(r);

    Rational z = new Rational(6,14);
    System.out.println(r.equals(z)); //true
    System.out.println(r.equals(t)); //true

  }

}//end class