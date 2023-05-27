package Module_5.ExpenseTracker;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TransactionIO {
    private static final String FILE_NAME = "expenses.txt";

    public static void bulkInsert(ArrayList<Transaction> transactions) throws IOException {
        PrintWriter output = null;
        if (new File(FILE_NAME).exists()) {
            output = new PrintWriter(new FileOutputStream(new File(FILE_NAME), true));
        } else {
            output = new PrintWriter(FILE_NAME);
        }

        for (Transaction transaction : transactions) {
            output.println(transaction.getDate() + "," + transaction.getDescription() + "," + transaction.getAmount());
        }

        output.close();
    }

    public static ArrayList<Transaction> findAll() throws IOException {
        ArrayList<Transaction> transactions = new ArrayList<>();
        Scanner input = new Scanner(new File(FILE_NAME));
        while (input.hasNext()) {
            String[] parts = input.nextLine().split(",");
            String date = parts[0];
            String description = parts[1];
            double amount = Double.parseDouble(parts[2]);
            Transaction transaction = new Transaction(date, description, amount);
            transactions.add(transaction);
        }
        input.close();
        return transactions;
    }
}
