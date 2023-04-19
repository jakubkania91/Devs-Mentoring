package tematyka9.Task4;

public class Main {
    public static void main(String[] args) {

        CalculationSystem calculationSystem = new CalculationSystem(new Calculator() {
            @Override
            public int substract(int a, int b) {
                return a - b;
            }

            @Override
            public int add(int a, int b) {
                return a + b;
            }

            @Override
            public int multiply(int a, int b) {
                return a * b;
            }

            @Override
            public double divide(int a, int b) {
                return a / b;
            }
        });
        calculationSystem.performCalculations(30, 10);

    }
}
