/**
 * Rational class by Team BangPi
 * Marieke Thomas
 * collaborators: Moo Joon Park, Greg Sciame, Kiana Herr
 */


/**
   class Rational
   An instance of this class will represent a rational number (p/q s.t. p,q ints && q!=0),
   and facilitate mathematical operations with another instance of class Rational.

   Basic level (complete all):
   - toString
   - default constructor
   - multiply
   - divide

   Intermediate level (complete Basic methods plus these methods):
   - floatValue
   - overloaded constructor

   Advanced level (complete Basic + Intermediate + these methods):
   -

*/


public class Rational
{
  // Instance variables aka attributes for numerator and denominator
  private int _numerator;
  private int _denominator;


  // default constructor (no parameters)
  // creates a new Rational with value 0/1
  public Rational()
  {
    this._numerator = 0; //can also just do _numerator without this.
    this._denominator = 1;
  }


  // overloaded constructor
  // takes 2 parameters, one for the numerator, one for the denominator
  // if an invalid denominator is attempted, should print a message and set the number to 0/1
  public Rational( int n, int d )
  {
    if(d == 0){
      System.out.println("You cannot divide by 0. I have reset the number to be 0/1.");
      this._numerator = 0;
      this._denominator = 1;
    } else{
      this._numerator = n;
      this._denominator = d;
    }
  }


  // toString
  // returns a string representation of the rational number (formatting of your choice)
  public String toString()
  {
    return this._numerator + "/" + this._denominator;
  }


  // floatValue
  // returns floating point approximation of the number
  // uses the most precise floating point primitive
  public double floatValue()
  {
    return (double)this._numerator/this._denominator;
  }


  // multiply
  // takes a Rational parameter and multiplies it by this Rational
  // does not return a value
  // modifies this object
  // does not modify input
  // need not reduce
  public void multiply( Rational r )
  {
    this._numerator = this._numerator * r._numerator;
    this._denominator *= r._denominator;
    this.simplify();
  }


  // divide
  // same as multiply, except operation is division
  public void divide( Rational r )
  {
    if (r._numerator == 0){
      System.out.println("Cannot divide by 0. The number has not been changed.");
    } else{
      this._numerator *= r._denominator;
      this._denominator *= r._numerator;
    }
    this.simplify();
  }

  //Simplifies a fraction by dividing by the greatest common factor
  public void simplify(){
    int gcf = 1;
    //Brute force method
    // for (int i =2; i< Math.min(this._numerator, this._denominator); i++){
    //   if (this._numerator%i == 0 && this._denominator%i == 0){
    //     gcf = i;
    //   }
    // }
    
    //Euclidean Algorithm Method
    gcf = findGcf(this._numerator, this._denominator);
    //System.out.println("The gcf is " + gcf);
    this._numerator /= gcf;
    this._denominator /= gcf;
  }

  public boolean equals(Rational other){
    this.simplify();
    other.simplify();
    return(this._numerator == other._numerator && this._denominator == other._denominator);
  }

  public static int findGcf(int a, int b){
    //Euclidean Algorithm Method
    if (a == 0){
      return b;
    } else if (b == 0){
      return a;
    } else{
      int larger = Math.max(a,b);
      int smaller = Math.min(a,b);
      int remainder = larger%smaller;
      return findGcf(remainder, smaller);
    }
  }

}//end class