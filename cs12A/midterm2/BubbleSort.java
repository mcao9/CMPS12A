class BubbleSort{
   static void sort(double[] X){
      int i, n;
      for(n = 0; n<X.length-1; n++){
         for(i=X.length-1; i>0; i--){
            if(X[i-1] > X[i]){
               swap(X,i-1,i);
            }
         }
      }      
   }
   static void swap(double[] Z, int i, int j){
      double temp;
      temp = Z[i];
      Z[i] = Z[j];
      Z[j] = temp;
   }
   public static void main(String[] args){
      double[] A = {7.0, 3.1, 6.6, 3.01, -5.2, 22.3, -17.0, 2.0};
      sort(A);
      for(int i = 0; i<A.length; i++){
         System.out.print(A[i] + " ");
      }
      System.out.println();
   }
}

