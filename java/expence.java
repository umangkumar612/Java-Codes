import java.util.ArrayList;
import java.util.Scanner;

class Expense {
    String category;
    double amount;
    String date;
    String notes;

    public Expense(String category, double amount, String date, String notes) {
        this.category = category;
        this.amount = amount;
        this.date = date;
        this.notes = notes;
    }
}

class ExpenseTracker {
    private ArrayList<Expense> expenses;

    public ExpenseTracker() {
        expenses = new ArrayList<>();
    }

    public void logExpense(String category, double amount, String date, String notes) {
        Expense expense = new Expense(category, amount, date, notes);
        expenses.add(expense);
        System.out.println("Expense logged successfully!");
    }

    public void displayExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses logged yet.");
        } else {
            System.out.println("Expense Log:");
            for (Expense expense : expenses) {
                System.out.println("Category: " + expense.category);
                System.out.println("Amount: $" + expense.amount);
                System.out.println("Date: " + expense.date);
                System.out.println("Notes: " + expense.notes);
                System.out.println("------------------------");
            }
        }
    }
}

public class project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExpenseTracker expenseTracker = new ExpenseTracker();

        while (true) {
            System.out.println("Expense Tracker Menu:");
            System.out.println("1. Log an Expense");
            System.out.println("2. Display Expenses");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter category: ");
                    String category = scanner.nextLine();
                    System.out.print("Enter amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter date: ");
                    String date = scanner.nextLine();
                    System.out.print("Enter notes: ");
                    String notes = scanner.nextLine();

                    expenseTracker.logExpense(category, amount, date, notes);
                    break;

                case 2:
                    expenseTracker.displayExpenses();
                    break;

                case 3:
                    System.out.println("Exiting Expense Tracker. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}