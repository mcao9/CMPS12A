// Guess.java
// Michael Cao
// mcao9@ucsc.edu
// pa2
// an interactive guessing game

import java.util.Scanner;

class Guess{

   public static void main( String[] args ){

      double randomNumber  = Math.random();
      int firstGuess, secondGuess, thirdGuess;
      Scanner sc = new Scanner(System.in);
      randomNumber = (int)((randomNumber*10)+1);
      System.out.println();
      System.out.println("I'm thinking of an integer in the range 1 to 10.  You have three guesses.");
      System.out.println();
      System.out.print("Enter your first guess: ");
      firstGuess = sc.nextInt();
      if (firstGuess == randomNumber){
         System.out.println("You win!");
         System.exit(0);
      }
      else if (firstGuess < randomNumber){
         System.out.println("Your guess is too low.");
         System.out.println();
      }
      else {
         System.out.println("Your guess is too high.");
         System.out.println();
      }
      
      System.out.print("Enter your second guess: ");
      secondGuess = sc.nextInt();
      if (secondGuess == randomNumber){
         System.out.println("You win!");
         System.exit(0);
      }
      else if (secondGuess < randomNumber){
         System.out.println("Your guess is too low.");
         System.out.println();
      }
      else {
         System.out.println("Your guess is too high.");
         System.out.println();
      } 
         
      System.out.print("Enter your third guess: ");
      thirdGuess = sc.nextInt();
      if (thirdGuess == randomNumber){
         System.out.println("You win!");
         System.exit(0);
      }
      else if (thirdGuess < randomNumber){
         System.out.println("Your guess is too low.");
         System.out.println();
      }
      else {
         System.out.println("Your guess is too high.");
         System.out.println();
      }
      System.out.println("You lose.  The number was " + (int)randomNumber + ".");
      System.out.println();
   }
}

