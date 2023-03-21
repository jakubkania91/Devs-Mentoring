package tematyka6;

public class MainCalc {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        int i = calc.sumNumbers(3, 4, 7, 10, 45, 70);
        System.out.println(i);
        int number = calc.addNumbers(3, 16);
        double numberD = calc.addNumbers(2.0, 3.0);
        System.out.println(number);
        System.out.println(numberD);


    }
    }

