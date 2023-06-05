package thirdProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExpenseManager {
    List<Expense>expenses = new ArrayList<>();

    public void displayAllExpenses() {
        expenses.forEach(expense -> {
            System.out.println(expense.description());
            System.out.println(expense.type());
            System.out.println(expense.value());
            System.out.println(expense.month());
        });
    }
    public void addExpense(Scanner scanner){
        System.out.println("Jaki wydatek chcesz dodac?");
        String description = scanner.nextLine();
        System.out.println("Jakiego typu jest to wydatek");
        String type = scanner.nextLine();
        System.out.println("Ile to kosztowalo");
        double value = Double.parseDouble(scanner.nextLine());
        System.out.println("Z ktorego miesiaca to wydatek");
        int month = Integer.parseInt(scanner.nextLine());

        Expense expense = new Expense(type,month,value,description);
        expenses.add(expense);

    }
}
