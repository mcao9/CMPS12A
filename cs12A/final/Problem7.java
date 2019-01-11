//Problem7.java
import java.util.Scanner;
import java.io.*;
class Problem7{
   public static void main(String[] args){
      Scanner sc;
      int count = 0;
      double sum = 0;
      if(args.length == 1){
         try{
	    sc = new Scanner(new File(args[0]));
            while(sc.hasNext()){
               String value = sc.next();
               try{
                  double num = Double.parseDouble(value);
                  count++;
                  sum = sum + num;
               }catch (NumberFormatException e1){
                  System.out.println("Double values only");
               }
            }               
            double avg = sum /(double) count;
            System.out.println("The average value of the " + args[0] + " is " + avg);
         }catch (FileNotFoundException e){
	    System.out.println("Error found");
	    System.exit(0);
	 }
      } else {
      System.out.println("Usage: java Problem7 filename");
      }
   }
}
