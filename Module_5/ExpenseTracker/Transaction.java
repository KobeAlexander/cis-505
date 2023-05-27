package Module_5.ExpenseTracker;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction {
    private String date;
    private String description;
    private double amount;

    public Transaction() {
        setDate(getTodayDate());
        setDescription("");
        setAmount(0);
    }

    public Transaction(String date, String description, double amount) {
        setDate(date);
        setDescription(description);
        setAmount(amount);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    private String getTodayDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        return sdf.format(new Date());
    }

    @Override
    public String toString() {
        return "Date: " + date + "\nDescription: " + description + "\nAmount: $" + String.format("%.2f", amount);
    }
}
