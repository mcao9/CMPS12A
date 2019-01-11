// Lawn.java
// Michael Cao
// mcao9@ucsc.edu
// pa1
// calculates the lawn area and mowing time of a lot

import java.util.Scanner;

class Lawn{
   
   public static void main( String[] args ){

      double lotLength, lotWidth, lotArea, houseWidth, houseLength, houseArea, lawnArea, mowingSpeed, mowingTime;
      int mowingHour, mowingMinute, mowingSecond;
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the length and width of the lot, in feet: ");
      lotWidth = sc.nextDouble();
      lotLength = sc.nextDouble();
      lotArea = lotWidth*lotLength;

      System.out.print("Enter the length and width of the house, in feet: ");
      houseWidth = sc.nextDouble();
      houseLength = sc.nextDouble();
      houseArea = houseWidth*houseLength;
   
      lawnArea = lotArea - houseArea;
      System.out.println("The lawn area is " + lawnArea + " square feet.");

      System.out.print("Enter the mowing rate, in square feet per second: ");
      mowingSpeed = sc.nextDouble();
      mowingTime = lawnArea/mowingSpeed;
      mowingSecond = (int) Math.round(mowingTime);
      mowingMinute = mowingSecond/60;
      mowingSecond = mowingSecond%60;
      mowingHour = mowingMinute/60;
      mowingMinute = mowingMinute%60;            
      
      System.out.println("The mowing time is " + mowingHour + " hour" + (mowingHour==1?" ":"s ") + mowingMinute + " minute" + (mowingMinute==1?" ":"s ") + mowingSecond + " second" + (mowingSecond==1?".":"s."));
   }
}
