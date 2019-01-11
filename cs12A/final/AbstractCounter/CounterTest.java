//-----------------------------------------------------------------------------
//  CounterTest.java
//  Test OneCounter and TwoCounter
//-----------------------------------------------------------------------------

class CounterTest{

   public static void main( String[] args ){

      OneCounter a = new OneCounter(100);
      TwoCounter b = new TwoCounter(100);

      a.click();
      b.click();
      System.out.println(a);
      System.out.println(b);
      for(int i=0; i<130; i++){
         a.click();
         b.click();
      }
      System.out.println(a);
      System.out.println(b);
       
      // We can create a reference variable of type AbstractCounter.
      AbstractCounter ac;
      
      // We can assign the reference to an existing subtype object.
      // This is the subtype principle again.
      ac = a;
      ac = b;
      
      // We cannot instantiate AbstractCounter though.
      // ac = new AbstractCounter();  // syntax error
      
      clickAndShow(a);  // Subtype principle at work again.
      clickAndShow(b);  // The subtypes OneCounter and TwoCounter
                        // are being supplied where the parent type
                        // is expected.
   }
   
   // This method takes an argument of type AbstractCounter, or any subtype thereof
   static void clickAndShow( AbstractCounter c ){
      c.click();
      System.out.println(c);
   }
}
