class BubbleSort1{
   static void sort(double[] X){
      int i, n;
      for(n = X.length; n > 0; n--){
         for(i = 0; i < n-1; i++){
            if(X[i]>X[i+1]){
               swap(X,i,i+1);
            }
         }
      }
   }
   static void swap(double[] X, int i, int j){
      double temp;
      temp = X[i];
      X[i] = X[j];
      X[j] = temp;
   }
   public static void main(String[] args){
      double[] A = {2.3, 4.5, 6.7, 8.9, 1.2, 3.4, 1.2, 4.5};
      sort(A);
      for(int i = 0; i < A.length; i++){
         System.out.println(A[i] + " ");
      }
      System.out.println();
   }
}
