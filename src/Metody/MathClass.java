package Metody;

public class MathClass {
    // modyfikator_dostepu zwracany_typ nazwa_metody(argumenty_metody){}
    public static int addNumbers(int firstNum, int secondNum) {
        System.out.println("FirstNumber: " + firstNum + ", SecondNumber: " + secondNum);
        return firstNum + secondNum;
    }

    public static void voidAddNumbers(int firstNum, int secondNum) {
        System.out.println("FirstNumber: " + firstNum + ", SecondNumber: " + secondNum);
    }
}
