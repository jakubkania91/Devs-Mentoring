package myTrials.MyTrialsall.Employee;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Robert", "menager", 40000);
        Employee employee1 = new Employee("Monika", "account", 60000);
        System.out.println("Details Employee:");
        employee.printEmployeeDetails();
        employee1.printEmployeeDetails();

        employee.raiseSalary(8);
        employee1.raiseSalary(12);


        System.out.println("\nAfter raising salary:");
        System.out.println("\n8% for 'Robert':");
        employee.printEmployeeDetails();
        System.out.println("\n12% for 'Monika':");
        employee1.printEmployeeDetails();
    }
}
