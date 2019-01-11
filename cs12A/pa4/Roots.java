// Roots.java
// Michael Cao
// mcao9@ucsc.edu
// pa4
// calculates the roots of a given polynomial with given endpoints

import java.util.Scanner;

class Roots{

   public static void main( String[] args ){
      Scanner sc = new Scanner(System.in);
      int degree;
      double tolerance = Math.pow(10,-10);
      double threshold = Math.pow(10,-3);
      System.out.println("Enter the degree: ");
      degree = sc.nextInt();
      int numCoe = degree+1;
      System.out.println("Enter " + numCoe + " coefficients: ");
      double[] C = new double[numCoe];
      for(int i = 0; i < numCoe; i++){   
         C[i] = sc.nextDouble();
      }
      int x = 10;
      double[] D = diff(C);
      while(true){
         System.out.println("Enter endpoints, or q to quit: ");
         if(!sc.hasNextDouble()){
            System.out.println("bye!");
            System.exit(0);
         }
         double a = sc.nextDouble();
         double b = sc.nextDouble();
         if(poly(C,a)*poly(C,b) <= 0){
            double aRoot = findRoot(C, a, b, tolerance);
            System.out.printf("   Odd root in [" + a + ", " + b + "] found at: %.10f%n", aRoot);
         }
         else if(poly(D,a)*poly(D,b) <= 0){
            double anotherRoot = findRoot(D, a, b, tolerance);
            if(Math.abs(poly(C,anotherRoot)) < threshold){
               System.out.printf("   Even root in [" + a + ", " + b + "] found at: %.10f%n", anotherRoot);
            } else {
               System.out.println("   No root found in [" + a + ", " + b + "]");
            }
         }
         else {
            System.out.println("   No root found in [" + a + ", " + b + "]");
         }  
      }
   }

   static double poly(double[] C, double x){
      double sum = 0;
      for(int i = 0; i < C.length; i++){
         sum  = sum + (C[i]*Math.pow(x, i));
      }
      return sum;
   }

   static double[] diff(double[] C){
      int numCoe = C.length-1;
      double[] D  = new double[numCoe];
      for(int i = 0; i < numCoe; i++){
         D[i] = C[i+1]*(i+1);
      }
      return D;
   }
   static double findRoot(double[] C, double a, double b, double tolerance){
      double mid=0.0, width;
      width = b-a;
      while(width>tolerance){
         mid = (a+b)/2.0;
         if( poly(C,a)*poly(C,mid)<= 0){
            b = mid;
         } else {
            a = mid;
         }
         width = b-a;
      }
      mid = (a+b)/2.0;
      return mid;
   }
}
