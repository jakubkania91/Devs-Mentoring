package tematyka6;

public class Calculator {
    public int addNumbers(int firstNumeber, int secondNumber) {
        return firstNumeber + secondNumber;
    }

    public double addNumbers(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sumNumbers(int... values) {
        int sum = 0;

        for (int number : values) {
            sum += number;
        }
        return sum;
    }
}
