package Module_6.ComposerApp;

import java.util.*;

public class Composer {

    private int id;
    private String name;
    private String genre;

    //Default constructor that creates a default composer
    Composer()
    {
        id = 0;
        name = "";
        genre = "";
    }

    Composer(int id, String name, String genre)
    {
        this.id = id;
        this.name = name;
        this.genre = genre;
    }

    //Accessor and Mutator methods for each data field
    public int getID()
    {
        return id;
    }
    public void setID(int id)
    {
        this.id = id;
    }
    
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getgenre()
    {
        return genre;
    }
    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    @Override
    public String toString()
    {
        String description = "Id: "+ this.id + "\n" + "Name: " + this.name + "\n" + "Genre: " + this.genre + "\n\n" ;
        return description;
    }

   
}



 


