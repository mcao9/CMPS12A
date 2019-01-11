import java.util.Scanner;
class Problem9{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String str;
      while(sc.hasNext()){
         str = sc.next();
         if(str.equals("galumph")){
            System.out.println("bye!");
            System.exit(0);
         }
         System.out.println(str);
      }
   }
}
        
