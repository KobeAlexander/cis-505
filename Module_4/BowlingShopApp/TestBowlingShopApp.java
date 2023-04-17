package Module_4.BowlingShopApp;
import java.util.Scanner;  // Import the Scanner class
import java.util.LinkedList;


public class TestBowlingShopApp {
    
    
    public static void displayMenu()
    {
        System.out.println("MENU OPTIONS");
        System.out.println("  1. <b> Bowling Balls");
        System.out.println("  2. <a> Bowling Bags");
        System.out.println("  3. <s> Bowling Shoes");
        System.out.println("  4. <x> To exit");

        System.out.print("\nPlease choose an option: ");
    }

    public static void main(String[] args){
        String menuInputString;
        char input;
        
        GenericQueue<Product> products = new GenericQueue<Product>();
        ProductDB menuInput = new ProductDB();

        System.out.println("Welcome to the Bowling Shop\n\n");

        do 
        {
            Scanner menuInputScanner = new Scanner(System.in);
            displayMenu();

            

            menuInputString = menuInputScanner.nextLine();

            products = menuInput.getProducts(menuInputString);
        
            input = menuInputString.charAt(0);
            if(input == 'x')
            { 
                break;
            }
            System.out.println("\n--Product Listing--"); 

            
            
            while (products.size() > 0)
            {
                Product toPrint = products.dequeue();
                System.out.printf("%s", toPrint + "\n\n");
            }

            

        }while (input != 'x');



    }    
}

