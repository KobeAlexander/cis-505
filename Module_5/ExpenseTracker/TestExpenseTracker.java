package Module_5.ExpenseTracker;
import java.util.Scanner;  // Import the Scanner class


public class TestExpenseTracker {
    
    public static void displayMenu()
    {
        
        System.out.println("\nMENU OPTIONS");
        System.out.println("  1. View Transactions");
        System.out.println("  2. Add Transactions");
        System.out.println("  3. View Expense");

        System.out.print("Please choose an option:");
    }

    public static void main(String[] args)
    {
        int input;
        String inputString;
        System.out.println("Welcome to the Expense Tracker");

        

        Scanner userInput = new Scanner(System.in);
        displayMenu();
        inputString = userInput.nextLine();
        input = Integer.valueOf(inputString);
        
        input = ValidatorIO.getInt(sc, menu());
    }
}
