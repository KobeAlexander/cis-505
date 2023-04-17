package Module_5.ExpenseTracker;
import java.util.Scanner;  // Import the Scanner class

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class TransactionIO {

    final static String FILE_NAME = "expense.txt";
    private static File file = new File(FILE_NAME);

    public static void bulkInsert(ArrayList<Transaction> transactions) throws IOException
    {
        PrintWriter output = null;

        if (file.exists())
        {
            output = new PrintWriter(new FileOutputStream(new File(FILE_NAME), true));
        }
        else
        {
            output = new PrintWriter(FILE_NAME);
        }

        for (Transaction tran : transactions)
        {
            output.print(tran.getDate() + " ");
            output.print(tran.getDescription() + " ");
            output.println(tran.getAmount());
        }

        output.close();
    }

    public static ArrayList<Transaction> findAll () throws IOException
    {
        ArrayList<Transaction> fileInput;
        Scanner input = new Scanner(file);
        while (input.hasNext())
        {
            fileInput.add(input.nextLine());
        }
    }
}
