class Problem13{
   static int getMaxIndex(int[] A, int start, int end){
      int max_index = start;
      for(int i = start+1; i<=end; i++){
         if(A[i]>A[max_index])
            max_index = i;
      }
      return max_index;
   }
   static void sort(int[] X){
      for(int i = X.length-1; i>=0; i--){
         int m = getMaxIndex(X,i,X.length-1);
         swap(X,m,i);
      }
   }
   static void swap(int[]A, int i, int j){
      int temp;
      temp = A[i];
      A[i] = A[j];
      A[j] = temp;
   }
   public static void main(String[] args){
      int[] data = {7,3,66,3,-5,22,-77,2};
      sort(data);
      for(int x : data){
         System.out.print(x+ " ");
      }
      System.out.println();
   }
}

