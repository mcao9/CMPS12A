
class Ragged{
   
   public static void main(String[] args){
      
      int[][] ragged = {{1,2},{3,4,5},{6}};
      
      
      // here's how one would do this manually
      //
      // int[][] ragged;
      //
      // ragged = new int[3][];
      // ragged[0] = new int[2];
      // ragged[1] = new int[3];
      // ragged[2] = new int[1];
      //
      // ragged[0][0] = 1;
      // ragged[0][1] = 2;
      // ragged[1][0] = 3;
      // ragged[1][1] = 4;
      // ragged[1][2] = 5;
      // ragged[2][0] = 6;
      
      System.out.print(ragged.length);
      print2dArray(ragged);
      
   }
   
   static void print2dArray(int[][] A){
      int i, j;
      
      for(i=0; i<A.length; i++){
         for(j=0; j<A[i].length; j++){
            System.out.print( A[i][j] + " " );
         }
         System.out.println();
      }
   }
}
