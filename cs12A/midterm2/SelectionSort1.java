class SelectionSort1{
   static int getMinIndex(int[] X, int start, int end){
      int i, min_index = start;
      for(i = start+1; i<=end; i++){
         if(X[i] < X[min_index]){
            min_index = i;
         }
      }
      return min_index;
   }
   static void sort(int[] X){
      int i, m;
      for(i = 0; i<X.length; i++){
         m = getMinIndex(X, i, X.length-1);
         swap(X, m, i);
      }
   }
   static void swap(int[] X, int i, int j){
      int temp;
      temp = X[i];
      X[i] = X[j];
      X[j] = temp;
   }
   public static void main(String[] args){
      int[] data = {7, 5, 9, 3, 5, 2, 5, 8, 100, 3334, 2, 1};
      sort(data);
      for( int i = 0; i < data.length; i++){
         System.out.print(data[i] + " ");
      }
      System.out.println();
   }
}
