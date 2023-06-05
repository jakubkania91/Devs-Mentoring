package thirdProject;

import java.util.Scanner;

public class ExpensesApp {
    public void start() {
        Scanner scanner = new Scanner(System.in);
        ExpenseManager expenseManager = new ExpenseManager();

        while (true){
            System.out.println("1. Wyswietl wydatki");
            System.out.println("2. Wyswietl wydatki z wybranego miesiaca");
            System.out.println("3. Dodaj wydatek");
            System.out.println("4. Zakoncz aplikacje");
            System.out.println("Wybierz opcje");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1 -> expenseManager.displayAllExpenses();
                case 2 -> System.out.println("wydatki z danego miesiaca");
                case 3 -> expenseManager.addExpense(scanner);
                case 4 ->{
                    scanner.close();
                    System.exit(0);
                }
            }

        }

    }
}
