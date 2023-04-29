package tematyka8.Task8;

public class Warning {
   private static String message = "Watch out! Warning here!";
   private static int numberOfLogins = 0;

   public static void execute(){
       numberOfLogins++;
       System.out.println(message);
       System.out.println("Warning has been executed " + numberOfLogins + " times");

   }
}
// modyfikator_dostepu zwracany_typ nazwa_metody(argumenty_metody){}

