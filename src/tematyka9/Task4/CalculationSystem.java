package tematyka9.Task4;

public class CalculationSystem {


    private Calculator calculator;

    public CalculationSystem(Calculator calculator) {
        this.calculator = calculator;
    }
    public void performCalculations(int firstNumber, int secondNumber){
        System.out.println(calculator.add(firstNumber, secondNumber));
        System.out.println(calculator.substract(firstNumber, secondNumber));
        System.out.println(calculator.multiply(firstNumber, secondNumber));
        System.out.println(calculator.divide(firstNumber, secondNumber));
    }


}
