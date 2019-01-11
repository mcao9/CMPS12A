
class SelectionSort {

   public static void main(String[] args) {
      
      int[] data = {7, 3, 66, 3, -5, 22, -77, 2};
      
      // sort the data
      sort(data);

      // print out the sorted data
      for (int x : data){
         System.out.print(x+" ");
      }
      // this loop is equivalent to
      // int x;
      // for (int i=0; i<data.length; i++){
      //    x = data[i];
      //    System.out.print(x+" "); 
      //}
      System.out.println();
   }
   
   // sort using the selection sort algorithm
   static void sort(int[] X) {
      int i, m;
      for (i = X.length-1; i > 0; i--) {
         m = getMaxIndex(X, 0, i);
         swap(X, m, i);
      }
   }
   
   // getMinIndex()
   // Returns the index of the smallest element in the subarray
   // A[ start ... end ] of array A[]
   static int getMaxIndex(int[] A, int start, int end){
      int i, Max_index=start;
      for(i=start+1; i<=end; i++){
         if( A[i]>A[Max_index] ) 
            Max_index = i;
      }
      return Max_index;
   }
   
   // swap two entries in an array
   static void swap(int[] A, int i, int j){
      int temp;
      temp = A[i];
      A[i] = A[j];
      A[j] = temp;
   }

}
