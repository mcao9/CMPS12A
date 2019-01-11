//----------------------------------------------------------------------------
//  TwoCounter.java
//  Another subclass of abstract class AbstractCounter
//-----------------------------------------------------------------------------

class TwoCounter extends AbstractCounter{
   
   // Constructor
   TwoCounter(int limit){
      this.value = 0;
      this.limit = limit;
   }
   
   // Implementation of abstract function
   void click(){
      value = (value+2)%limit;
   }
}