class DownCounter extends AbstractCounter{
   //Constructor
   DownCounter(int limit){
      this.limit = limit;
      this.value = limit;
   }
   
   void click(){
      value = value - 1;
      if(value<1) value = limit;
   }
   void reset(){
      value = limit;
   }
}
