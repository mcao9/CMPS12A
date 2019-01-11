class DrawSquare{
   public static void main(String[] args){
      int n = args.length;
      int squareSize = 0;
      String ast = "*";
      String empty = " ";
      if(n == 1){
         try{
            squareSize = Integer.parseInt(args[0]);
            if(squareSize < 2){
               System.out.println("Usage: java DrawSquare <positive integer at least 2>");
               System.exit(0);
            }
         }catch(NumberFormatException e1){
            System.out.println("Usage: java DrawSquare <positive integer at least 2>");
            System.exit(0);
         }
      } else {
         System.out.println("Usage: java DrawSquare <positive integer at least 2>");
         System.exit(0);
      }
      String[][] A = new String[squareSize][squareSize];
      int i, j;
      for(i = 0; i < A.length; i++){
         for(j = 0; j < A[0].length; j++){
             if(i == 0 || i == squareSize-1){
                A[i][j] = ast;
             } else if (i > 0 && i < squareSize-1 && j < 1 || j > squareSize-2){
                A[i][j] = ast;
             } else {
                A[i][j] = empty;
             }
         }
      }
      for(i = 0; i < A.length; i++){
         for(j = 0; j < A[0].length; j++){
            System.out.print(A[i][j]);
         }
         System.out.println();
      }
   }
}
