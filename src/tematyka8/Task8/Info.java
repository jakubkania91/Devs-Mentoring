package tematyka8.Task8;

public class Info {
   private static String message = "Listen carefully. We have some information regarding ...";
   private static int numberOfLogins = 0;

   public static void execute(){
      numberOfLogins++;
      System.out.println(message);
      System.out.println("Info has been executed " + numberOfLogins + " times");
   }


}
