// Problem2.java
class Problem2{
   public static void main(String[] args){
      int[][] table = { {100, 9, 6, 12},
                        {23, -25, 54},
                        {0, -12, 1010, 8, 16} };
      System.out.println(getMax(table)); // prints 54
      System.out.println(getMex(table));
   }
   static int getMax(int[][] A){
   // your code goes here
      int max = 0;
      int row = 0;
      for(int i = 0; i < A.length; i++){
         for(int j = 0; j < A[i].length; j++){
            if(A[row][max] < A[i][j]){
	       row = i;
	       max = j; 
	    }
	 }
      }
      return A[row][max];	  
   }
   static int getMex(int[][] A){
      int max = 0;
      int i, j;
      for(i = 0; i < A.length; i++){
         for(j = 0; j < A[i].length; j++){
            if(A[i][j] > max){
               max = A[i][j];
            }
         }
      }
      return max;
   }  
}
