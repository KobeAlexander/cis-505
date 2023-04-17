package Module_5.ExpenseTracker;

public class Transaction {

    //Sets data fields
    private String date;
    private String description;
    private double amount;

    //Accessor and Mutators for each data field
    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public double getAmount()
    {
        return amount;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }

    Transaction()
    {
        date = "04-29-2023";
        description = "";
        amount = 0;
    }

    Transaction(String date, String description, double amount)
    {
        this.date = date;
        this.description = description;
        this.amount = amount;
    }

    @Override
    public String toString()
    {
        String transaction = this.date + "\n" + this.description + "\n" + this.amount;
        return transaction;
    }

    
}
