// GCD.java
// Michael Cao
// mcao9@ucsc.edu
// pa3
// Find the greatest common divisor

import java.util.Scanner;

class GCDInfinite{
   
   public static void main( String[] args ){
      int firstNumber, secondNumber, dividend, divisor, remainder, GCD; 
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a positive integer: ");
      while(true){
         while(!sc.hasNextInt()){ 
            
            System.out.print("Please enter a positive integer: ");
            continue;           
         }
         break;
      }
      firstNumber = sc.nextInt();
      System.out.print("Enter another positive integer: ");
      while(true){
         while(!sc.hasNextInt()){
            sc.next();
            System.out.print("Please enter a positive integer: ");
         }
         if(sc.hasNextInt()){
            secondNumber = sc.nextInt();
            if(secondNumber<0){
               System.out.print("Please enter a positive integer: ");
            } else {
               break;
            }
         }
      }
         if(firstNumber < secondNumber){
            dividend = secondNumber;
            divisor = firstNumber;
         } else {
            divisor = secondNumber;
            dividend = firstNumber;
         }
      remainder = dividend % divisor;
      while (remainder > 0){
         dividend = divisor;
         divisor = remainder;
         remainder = dividend % divisor;
      }
      GCD = divisor;
      System.out.println("The GCD of " + firstNumber + " and " + secondNumber + " is " + GCD);
   }
}
      
         
         
         
      

