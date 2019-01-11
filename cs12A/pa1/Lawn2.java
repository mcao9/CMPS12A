// Lawn.java
// Michael Cao
// mcao9@ucsc.edu
// pa1
// calculates the lawn area and mowing time of a lot

import java.util.Scanner;

class Lawn2{
   
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
      mowingHour = (int)mowingTime/3600;
      mowingMinute = ((int)mowingTime/60)-(mowingHour*60);
      mowingSecond = (int)mowingTime-(mowingHour*3600)-(mowingMinute*60);
      System.out.println("The mowing time is " + mowingHour + " hour"+(mowingHour==1?" ":"s ") + mowingMinute + " minute"+(mowingMinute==1?" ":"s ") + mowingSecond + " second"+(mowingSecond==1?" ":"s."));
   }
}
