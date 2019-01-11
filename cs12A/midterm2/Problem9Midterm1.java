class Problem9Midterm1{
   static double square(int n){
      double squared = Math.pow(n,2);
      return squared;
   }
   static double cube(int n){
      double cubed = Math.pow(n,3);
      return cubed;
   }
   static double quartic(int n){
      double quart = Math.pow(n,4);
      return quart;
   }
   static double quintic(int n){
      double quint = Math.pow(n,5);
      return quint;
   }
   public static void main(String[] args){
      for(int i = 1; i <= 25; i++){
         int a =(int)square(i);
         int b =(int)cube(i);
         int c =(int)quartic(i);
         int d =(int)quintic(i);
         System.out.printf("%-12d", i);
         System.out.printf("%-12d", a);
         System.out.printf("%-12d", b);
         System.out.printf("%-12d", c);
         System.out.printf("%-12d", d);
      }
   }
}
