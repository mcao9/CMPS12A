import java.util.Scanner;
class problem{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int hour = sc.nextInt();
      int min = sc.nextInt();
      int day = sc.nextInt();

      if((day == 1 || day == 2) && hour < 10 && min < 10){
        System.out.println(prt(hour) + ":" + prt(min));
      } else if((day == 1 || day == 2) && hour >= 10 && min < 10){
        System.out.println((day == 2 ? hour + 12 : hour) + ":" + prt(min));
      } else if((day == 1 || day == 2) && hour >= 10 && min >= 10){
        System.out.println(prt(hour) + ":" + min);
      } else {
        System.out.println(hour + ":" + min);
      }
   }
           
   static String prt(int A){
      return("0" + A);
   }
}  
      
