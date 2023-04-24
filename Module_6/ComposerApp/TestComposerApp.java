package Module_6.ComposerApp;
import java.util.*;

public class TestComposerApp {

    public static void displayMenu()
    {
        System.out.println("MENU OPTIONS");
        System.out.println("  1. View Composers");
        System.out.println("  2. Find Composers");
        System.out.println("  3. Add Composer");
        System.out.println("  4. Exit");

        System.out.print("\nPlease choose an option: ");
    }
    public static void main(String[] args){

        MemComposerDao composorObject = new MemComposerDao();
        int idInputInt;
        int menuInputInt;
        

        System.out.println("Welcome to the Composer App\n");
    
        do{

            Scanner menuInputScanner = new Scanner(System.in);
            displayMenu();

            String menuInputString = menuInputScanner.nextLine();
           menuInputInt = Integer.parseInt(menuInputString);

            if (menuInputInt == 1)
            {
                System.out.println("\n\n--DISPLAYING COMPOSERS--");
                String output = composorObject.findAll().toString();
                output = output.replace("[","").replace("]","").replace(", ","");
                System.out.println(output);
               

            }
                else if (menuInputInt == 2)
                {
                    Scanner idInputScanner = new Scanner(System.in);

                    System.out.print("\nEnter an id: ");

                    String idInputString = menuInputScanner.nextLine();
                    idInputInt = Integer.parseInt(idInputString);
                    System.out.println("\n\n--DISPLAYING COMPOSER--");
                    System.out.print(composorObject.findBy(idInputInt).toString());
                   

                }
                    else if (menuInputInt == 3)
                    {
                        Scanner newIDScanner = new Scanner(System.in);
                        System.out.print("\nEnter an id: ");
                        String newIDString = newIDScanner.nextLine();
                        int newID = Integer.parseInt(newIDString);
                        

                        Scanner newNameScanner = new Scanner(System.in);
                        System.out.print("Enter a name: ");
                        String newNameString = newNameScanner.nextLine();
                        

                        Scanner newGenreScanner = new Scanner(System.in);
                        System.out.print("Enter a genre: ");
                        String newGenreString = newGenreScanner.nextLine();
                        System.out.println("");
                        

                        Composer newComp = new Composer(newID, newNameString, newGenreString);
                        composorObject.insert(newComp);


                    }



        }while(menuInputInt != 4);



    }
    
}
