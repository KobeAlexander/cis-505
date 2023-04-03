package Module_3.CustomerAccountApp;
import java.util.Scanner;  // Import the Scanner class

public class TestCustomerAccountApp{
    
    public static void main(String[] args)
    {
        //Setting variable for continue input
        char userCoChar;
        double newBalance;
        String currentDate;
        //double setBalance;

        //Setting new instance of displayMenu
        Account accountMenu = new Account();
        CustomerDB customer = new CustomerDB();
        Account account = new Account();
        Customer customerDetail = new Customer();
       

        //Display Welcome to App
        System.out.println("Welcome to the Customer Account App");

        //Scanner for Account ID
        Scanner customerIDScanner = new Scanner(System.in);
        System.out.print("\nEnter a customer ID: " + "\n  ex: 1007, 1008, 1009>: ");

        //Reading ID input
        String  customerIDString = customerIDScanner.nextLine();
        System.out.println(" ");

        int customerID = Integer.parseInt(customerIDString);
        customerDetail = customer.getCustomer(customerID, null);
        
        //Testing customer found
        //System.out.println(customerDetail);

        //While loop for the continue menu
       do
       {
        accountMenu.displayMenu();

        Scanner menuInputScanner = new Scanner(System.in);
        System.out.print("  Enter Option: ");
        String menuInputString = menuInputScanner.nextLine();


        switch (menuInputString)
        {
            case "d":
            case "D":
            System.out.print("\nEnter deposit amount: "); //Prompts user to enter deposit amount
            Scanner depositAmountScanner = new Scanner(System.in); //Scans for user input
            String depositAmountString = depositAmountScanner.nextLine(); //Reads user input into a string
            double depositAmount = Double.parseDouble(depositAmountString); //Changes the string to a double amount
            newBalance = account.deposit(depositAmount); //Sets the newBalance variable as the old balance plus the input amount
            account.setBalance(newBalance); //Sets the balance as the new Balance
           
            //System.out.println("New balance = " + newBalance);
            break;

            case "w":
            case "W":
            System.out.print("\nEnter withdraw amount: ");
            Scanner withdrawAmountScanner = new Scanner(System.in);
            String withdrawAmountString = withdrawAmountScanner.nextLine();
            double withdrawAmount = Double.parseDouble(withdrawAmountString);
            newBalance = account.withdraw(withdrawAmount);
            account.setBalance(newBalance);
            
            break;


            case "b":
            case "B":
            System.out.printf("\nAccount balance: $%.2f" , account.getBalance());
            break;

            

            default:
            System.out.println("\nError: Invalid Option");

        }
        

        //Create a Scanner object for the loop
        Scanner userCoScanner = new Scanner(System.in);
        System.out.print("\nContinue? (y/n): ");
        

        //Read user input for continue
        userCoChar = userCoScanner.nextLine().charAt(0);
        System.out.print("\n\n");


       } while (userCoChar !=  'n');

       
       currentDate = account.getTransactionDate();
       newBalance = account.getBalance();


       System.out.println("--Customer Details--");
       System.out.println(customerDetail);
       System.out.printf("\nBalance as of %s is $%.2f" , currentDate ,newBalance);
    }

    

}
