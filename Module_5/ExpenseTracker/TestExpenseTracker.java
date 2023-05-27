package Module_5.ExpenseTracker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestExpenseTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            displayMenu();
            int choice = ValidatorIO.getInt(sc, "Enter your choice: ");

            switch (choice) {
                case 1:
                    displayAllTransactions();
                    break;
                case 2:
                    addTransactions(sc);
                    break;
                case 3:
                    displayTotalExpenses();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        sc.close();
    }

    private static void displayMenu() {
        System.out.println("\nExpense Tracker Menu");
        System.out.println("1. View all transactions");
        System.out.println("2. Add a new transaction");
        System.out.println("3. Calculate total expenses");
        System.out.println("4. Exit");
    }

    private static void displayAllTransactions() {
        try {
            ArrayList<Transaction> transactions = TransactionIO.findAll();
            System.out.println("\nAll Transactions:");
            for (Transaction transaction : transactions) {
                System.out.println(transaction);
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Error reading transactions: " + e.getMessage());
        }
    }

    private static void addTransactions(Scanner sc) {
        boolean addMore = true;
        ArrayList<Transaction> transactions = new ArrayList<>();

        while (addMore) {
            String date = ValidatorIO.getString(sc, "Enter transaction date (MM-dd-yyyy): ");
            String description = ValidatorIO.getString(sc, "Enter transaction description: ");
            double amount = ValidatorIO.getDouble(sc, "Enter transaction amount: ");
            Transaction transaction = new Transaction(date, description, amount);
            transactions.add(transaction);

            addMore = ValidatorIO.getString(sc, "Add another transaction? (yes/no): ").equalsIgnoreCase("yes");
        }

        try {
            TransactionIO.bulkInsert(transactions);
            System.out.println("Transactions added successfully.");
        } catch (IOException e) {
            System.out.println("Error writing transactions: " + e.getMessage());
        }
    }

    private static void displayTotalExpenses() {
        try {
            ArrayList<Transaction> transactions = TransactionIO.findAll();
            double totalExpenses = 0;
            for (Transaction transaction : transactions) {
                totalExpenses += transaction.getAmount();
            }
            System.out.println("\nTotal Expenses: $" + String.format("%.2f", totalExpenses));
        } catch (IOException e) {
            System.out.println("Error reading transactions: " + e.getMessage());
        }
    }
}

