
/*
Alexander, K. (2023). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved. 
*/

package Module_2.SportsTeamApp;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;  // Import the Scanner class
import java.util.ArrayList;
import java.util.*;


public class Team {

    //Turning the Array to a list
    /*public static String[] playerAdd(String players[], String insertedPlayer)
    {
        
        //Turns players array into list using asList() method
        List<String> playerList = new ArrayList<String>(Arrays.asList(players));

        //Adds new string to array
        playerList.add(insertedPlayer);

        //Transform the ArrayList into an Array
        players = playerList.toArray(players);
            return players;
    }*/
    
        //Setting Private variables
            private String teamName;
            private String[] players;
            private int playerCount;

        //Setting public variables
             String getPlayers[];

        //A non-argument constructor that sets the fields to the default value
        public Team()
            {
                teamName = " ";
                players = new String[20];
                playerCount = 0;

            }

        //Setting accessors and mutators for each data field
        //Accessor for teamName
        public String getTeamName(){
            return teamName;
        }
        //Mutator for teamName
        public void setTeamName(String teamName){
            this.teamName = teamName;
        }

        //Accessor for playerCount
        public int getPlayerCount(){
            return playerCount;
        }
        //Mutator for playerCount
        public void setPlayerCount(int playerCount){
            this.playerCount = playerCount;
        }


        //Creating Argument constructor for teamName
        public Team(String teamName){
            setTeamName(teamName);
            players = new String[20];
                playerCount = 0;

        }

        
        
        //Method that adds a player to the players data field and increments the playerCount field
        public void addPlayer(String insertPlayer){

            
            players[playerCount]=insertPlayer;
            playerCount = playerCount++;




        }

        

}

