// Rational.java
class Rational{
   int numerator; int denominator; // Fields
   Rational(int n, int d){ // Constructor
      if(d==0) throw new RuntimeException("zero denominator");
      numerator = n; denominator = d;
   }
   Rational plus(Rational Q){
      int num = this.denominator * Q.numerator + this.numerator * Q.denominator;
      int den = this.denominator * Q.denominator;
	  return new Rational(num, den);
   }
   Rational times(Rational Q){
      int num = this.numerator * Q.numerator;
	  int den = this.denominator * this.denominator;
	  return new Rational(num, den);
   }
   public String toString(){
      return this.numerator + "/" + this.denominator;

   }
   public boolean equals(Object x){
      boolean eq = false;
	  Rational z;
	  if( x instanceof Rational){
	     z = (Rational)x;
		 eq = (this.denominator == z.denominator && this.numerator == z.numerator);
	  }
	  return eq;
   }  
} // end of class Rational
