class Problem12{
   static int binarySearch(String[] X, String target){
      int middle;
      int left = 0, right = X.length-1;
      while(left <= right){
         middle = (left + right)/2;
         if(X[middle].compareTo(target) == 0){
            return middle;
         }
         else if(X[middle].compareTo(target) < 0){
            left = middle+1;
         }
         else {
            right = middle-1;
         }
      }
      return -1;
   }
   public static void main(String[] args){
      String[] C = {"apple", "carrot", "potato", "queen", "zebra"};
      int index = binarySearch(C, "potat");
      System.out.println(index);
   }
}
