class Problem11{
   static void sortStringArray(String[] X){
      for(int i = 0; i < X.length - 1; i++){
         int m = alphabet(X, i, X.length-1);
         swap(X, m, i);
      }
   }
   static int alphabet(String[] X, int start, int end){
      int beg = start;
      for(int i = start + 1; i <= end; i++){
         if(X[i].compareTo(X[beg])>0){
            beg = i;
         }
      }
      return beg;
   }
 
   static void swap(String[] X, int i, int j){
      String temp;
      temp = X[i];
      X[i] = X[j];
      X[j] = temp;
   }
   public static void main(String[] args){
      String[] A = {"a", "z", "y", "u", "y", "w", "b", "n", "l", "i", "o", "y", "u", "h", "b", "z", "x", "a", "s", "e", "f", "p", "r"};
      for(int i = 0; i < A.length; i++){
         System.out.print(A[i] + " ");
      }
      System.out.println();
      sortStringArray(A);
      for(int i = 0; i < A.length; i++){
         System.out.print(A[i] + " ");
      }
      System.out.println();
   }
}
