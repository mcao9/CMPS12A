class Problem7{
   public static void main(String[] args){
      int[] list = {3, 9, 6, 12, 23, -25, 54, 9, 0, -12, 27};
      System.out.println(list[getMaxIndex(list)]);
      System.out.println(list[getMinIndex(list)]);
   }
   static int getMinIndex(int[] A){
      int minIndex = 0;
      for(int i = 0; i < A.length; i++){
         if(A[i] < A[minIndex]){
            minIndex = i;
         }
      }
      return minIndex;
   }
   static int getMaxIndex(int[] A){
      int maxIndex = 0;
      for(int i = 0; i < A.length; i++){
         if(A[i] > A[maxIndex]){
            maxIndex = i;
         }
      }
      return maxIndex;
   }
}
