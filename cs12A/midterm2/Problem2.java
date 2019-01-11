class Problem2{
   static int[] concatenate(int[] A, int[] B){
      int[] C = new int[A.length + B.length];
      for(int i = 0; i < A.length; i++){
         C[i] = A[i];
      }
      for(int i = 0; i < B.length; i++){
         C[A.length+i] = B[i];
      }
      return C;
   }
   public static void main( String[] args ){
      int[] X = {10, 9, 8, 7, 6};
      int[] Y = {5, 4, 3, 2, 1};
      int[] C = concatenate(X, Y); 
      System.out.println(C.length);
      for(int x : C){
         System.out.print(x+" ");
      }
      System.out.println();
   }
}
      
