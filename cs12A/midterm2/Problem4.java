class Problem4{
   public static void main(String[] args){
      int a = sum(10);
      System.out.println(a);
   }
   static int sum(int n){
      if(n <= 1){
         return 1;
      } else {
         return sum(n-1) + n;
      }
   }
}
