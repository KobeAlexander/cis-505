package Module_2.SportsTeamApp;
import java.util.Scanner;  // Import the Scanner class

public class TestSportsTeamApp {

    public static void main(String[] args)
    {
        char userCoChar;

        //Output Welcome Banner
        System.out.println("  Welcome to the Sports Team App\n");

      do
       {

        //Create a Scanner object for the team name
        Scanner teamNameScanner = new Scanner(System.in);
        System.out.print("  Enter a team name: ");

        //Read user input for team name
        String teamNameString = teamNameScanner.nextLine();

        Team team1 = new Team(teamNameString);
        

        //Create a Scanner object for the player names
        Scanner playerNameScanner = new Scanner(System.in);
        System.out.print("\n  Enter the player names: " + "\n    hint: use commas for multiple players; no spaces>: ");

        //Read user input for player names
        String playerNameString = playerNameScanner.nextLine();

        String[] playerNameArray = playerNameString.split(",");
        
        System.out.println("\n  --Team Summary--");
        System.out.println("  Number of players in team: " + playerNameArray.length);
        System.out.print("  Players on team: " );
        for (int i = 0; i < playerNameArray.length; i++)
        {
            team1.addPlayer(playerNameArray[i]);
            System.out.print(playerNameArray[i]+ ",");
        }
        


        //Create a Scanner object for the loop
        Scanner userCoScanner = new Scanner(System.in);
        System.out.print("\n\n  Continue? (y/n): ");
        

        //Read user input for continue
        userCoChar = userCoScanner.nextLine().charAt(0);

        System.out.println();
        
       } while (userCoChar !=  'n');

       System.out.print("\n  End of Line...");
    }
}


