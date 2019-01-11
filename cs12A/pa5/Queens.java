// Queens.java
// Michael Cao
// mcao9@ucsc.edu
// pa5
// This program finds all the solutions to the n-Queens problem
class Queens{
   static void nextPermutation(int[] A){
      int i, pivot=0, successor=0;
      for(i = A.length-2; i >= 0; i--){
         if(A[i] < A[i+1]){
            pivot = i;
            break;
         }
      }
      if(pivot == 0){
         reverse(A, 1, A.length-1);
         return;
      }
      for(i = A.length-1; i > pivot; i--){
         if(A[i] > A[pivot]){
            successor = i;
            break;
         }
      }
      swap(A, pivot, successor);
      reverse(A, pivot+1, A.length-1);
      return;
   }
   static void swap(int[] S, int i, int j){
      int temp;
      temp = S[i];
      S[i] = S[j];
      S[j] = temp;
   }
   static void reverse(int[] D, int start, int end){
      while(start < end){
         swap(D, start, end);
         start++;
         end--;
      }
   }
   static void printArray(int[] E){
      System.out.print("(");
      if( E.length > 0){
         System.out.print(E[1]);
      }
      for(int i = 2; i < E.length; i++){
         System.out.print(", " + E[i]);
      }
      System.out.println(")");
   }
   static boolean sameArray(int[] P){
      for(int i = 0; i < P.length-1; i++){
         if(P[i] == i){
            continue;
         } else {
            return false;
         }
      }
      return true;
   }   
   static boolean isSolution(int[] A){
      int n = A.length-1;
      int i, j; 
      for(i = 1; i<n; i++){
         for(j = i + 1; j <= n; j++){
            if(Math.abs(A[j]- A[i]) == Math.abs(j - i)){
               return false;
            }
         }
      }
      return true; 
   }
   public static void main( String[] args ){
      int i, n = args.length, numSol = 0, in1 = 0;
      boolean in2 = false;
      if(n == 1){
      try{
         in1 = Integer.parseInt(args[0]);
         if(in1 <= 0 || in1 >= 14){
            System.out.println("Usage: Queens [-v] number");
            System.out.println("Option:  -v  verbose output, print all solutions");
            System.exit(0);
         }
      }catch(NumberFormatException e1){
         System.out.println("Usage: Queens [-v] number");
         System.out.println("Option:  -v  verbose output, print all solutions");
         System.exit(0);
      } 
      } else if(n == 2){
      try{
         in2 = args[0].equals("-v");
         in1 = Integer.parseInt(args[1]);
         if(in1 <= 0 || in1 >= 14){
            System.out.println("Usage: Queens [-v] number");
            System.out.println("Option:  -v  verbose output, print all solutions");
            System.exit(0);
         } 
      }catch(NumberFormatException e2){
         System.out.println("Usage: Queens [-v] number");
         System.out.println("Option:  -v  verbose output, print all solutions");
         System.exit(0);
      }
      } else {
         System.out.println("Usage: Queens [-v] number");
         System.out.println("Option:  -v  verbose output, print all solutions");
         System.exit(0);
      }
      int boardSize = in1 + 1;
      int[] A = new int[boardSize];
      for(i = 1; i < A.length; i++){
         A[i] = i;
      }
      if(in2 == true){ 
         while(A[0] == 0){
            if(isSolution(A) == true){
               numSol++;
               printArray(A);
            }
            nextPermutation(A);
            if(sameArray(A) == true){
               A[0] = A[0] + 1;
            }
         }
         System.out.println(in1 + "-Queens has " + numSol + " solutions");
      } 
      else { 
         while(A[0] == 0){
            if(isSolution(A) == true){
               numSol++;
            }
            nextPermutation(A);
               if(sameArray(A) == true){
                  A[0] = A[0] + 1;
            }
         }
         System.out.println(in1 + "-Queens has " + numSol + " solutions");
      } 
   }
}    
