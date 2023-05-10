package tematyka8.Task8;

public class MessagingSystem {
    public static void main(String[] args) {
        showWarning();
        showWarning();
        showInfo();
        showInfo();
        showInfo();

    }
   static void showWarning(){
       Warning.execute();

    }
    static void showInfo(){
        Info.execute();
    }
}
