class Problem5Midterm1{
   static int sum(int n){
      int sum = 0;
      for (int i = 0; i <= n; i++){
         sum = sum + i;
      }
      return sum;
   }
   static double avg(int n){
      double sum = sum(n);
      double avg = sum / (double) n;
      return avg;
   }
   static boolean ord(double x, double y, double z){
      if(x < y && y < z){
         return true;
      } else {
         return false;
      }
   }
   public static void main(String[] args) {
      System.out.println(avg(12));
      System.out.println(ord(1.2, 3.4, 5.6));
      System.out.println(ord(3.4, 1.2, 5.6));
   }
}
