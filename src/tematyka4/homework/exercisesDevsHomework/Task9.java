package tematyka4.homework.exercisesDevsHomework;

public class Task9 {
    public static void main(String[] args) {

        int naturalNumbers = 10;
        int sum = 0;

        for (int i = 1; i <= naturalNumbers; i++) {
            sum += i;
        }
        double averageOfNumbers = (double) sum / naturalNumbers;
        System.out.println("Srednia arytmetyczna pierwszych " + naturalNumbers + " liczb naturalnych wynosi: " + averageOfNumbers);
    }
}
