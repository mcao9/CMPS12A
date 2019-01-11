//-----------------------------------------------------------------------------
//  OneCounter.java
//  Subclass of abstract class AbstractCounter
//-----------------------------------------------------------------------------

class OneCounter extends AbstractCounter{
   
   // Constructor
   OneCounter(int limit){
      this.value = 0;
      this.limit = limit;
   }
   
   // Implementation of abstract function
   void click(){
      value = (value+1)%limit;
   }
}
