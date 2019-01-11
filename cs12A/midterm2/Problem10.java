class Problem10{
   static void printStringArray(String[] X){
      for(int i = X.length - 1; i >= 0; i--){
         System.out.println(X[i]);
      }
   }
   public static void main(String[] args){
      String[] C = {"one", "two", "three"};
      printStringArray(C);
   }
}
