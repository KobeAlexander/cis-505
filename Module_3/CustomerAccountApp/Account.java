package Module_3.CustomerAccountApp;

public class Account {
    
    //Declaring variables
    private double balance = 200;

    //Setting accessor for Balance
    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double newBalance)
    {
       balance = newBalance;
    }

    //Method that increases the running total of the balance
    public double deposit(double amt)
    {
        return balance = getBalance() + amt;
    }

    public double withdraw(double amt)
    {
        if (balance >= amt)
        {
           balance = getBalance() - amt;
        }
        return balance;
    }

    public void displayMenu()
    {
        System.out.println("Account Menu");
        System.out.println("Enter <D/d> for deposit ");
        System.out.println("Enter <W/w> for withdraw");
        System.out.println("Enter <B/b> for balance");
       // System.out.println("  Enter option: ");
    }

    public String getTransactionDate()
    {
        String date = "04-29-2023";
        return date;
    }

}
