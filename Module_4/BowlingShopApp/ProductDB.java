package Module_4.BowlingShopApp;
// Importing input output classes
import java.io.*;
// Importing all utility classes
import java.util.*;

import javax.lang.model.util.ElementScanner6;

public class ProductDB {
    
    public static GenericQueue<Product> getProducts(String code)
    {
        //If user selection is B/b for bowling ball
        if (code.equalsIgnoreCase("b"))
        {
            Ball ball1 = new Ball();
            ball1.setCode("B100");
            ball1.setDescription("Black Widow 2.0");
            ball1.setPrice(144.95);
            ball1.setColor("Black and Red");

            Ball ball2 = new Ball();
            ball2.setCode("B200");
            ball2.setDescription("Captain America");
            ball2.setPrice(250.50);
            ball2.setColor("Red, White, and Blue");

            Ball ball3 = new Ball();
            ball3.setCode("B300");
            ball3.setDescription("Iron Man");
            ball3.setPrice(255.99);
            ball3.setColor("Red and Gold");

            Ball ball4 = new Ball();
            ball4.setCode("B400");
            ball4.setDescription("Black Panther");
            ball4.setPrice(149.99);
            ball4.setColor("Black and Purple");

            Ball ball5 = new Ball();
            ball5.setCode("B500");
            ball5.setDescription("Spider-Man");
            ball5.setPrice(115.99);
            ball5.setColor("Red and Blue");

            GenericQueue<Product> balls = new GenericQueue<Product>();
            balls.enqueue(ball1);
            balls.enqueue(ball2);
            balls.enqueue(ball3);
            balls.enqueue(ball4);
            balls.enqueue(ball5);

            return balls;
        }

        //If user selection equals S/s for shoes
        else if (code.equalsIgnoreCase("s"))
        {
            Shoe shoe1 = new Shoe();
            shoe1.setCode("S100");
            shoe1.setDescription("Superman 1's");
            shoe1.setPrice(88.00);
            shoe1.setSize(9);

            Shoe shoe2 = new Shoe();
            shoe2.setCode("S200");
            shoe2.setDescription("Dark Knights");
            shoe2.setPrice(100.00);
            shoe2.setSize(11);

            Shoe shoe3 = new Shoe();
            shoe3.setCode("S300");
            shoe3.setDescription("Wonder Woman 6's");
            shoe3.setPrice(75.99);
            shoe3.setSize(7);

            Shoe shoe4 = new Shoe();
            shoe4.setCode("S400");
            shoe4.setDescription("Barry Allen's");
            shoe4.setPrice(85.99);
            shoe4.setSize(10);

            Shoe shoe5 = new Shoe();
            shoe5.setCode("S500");
            shoe5.setDescription("Cyborg Light's");
            shoe5.setPrice(65.99);
            shoe5.setSize(12);

            GenericQueue<Product> shoes = new GenericQueue<Product>();
            shoes.enqueue(shoe1);
            shoes.enqueue(shoe2);
            shoes.enqueue(shoe3);
            shoes.enqueue(shoe4);
            shoes.enqueue(shoe5);

            return shoes;
        }

        //If user selection is A/a
        else if (code.equalsIgnoreCase("a"))
        {

            Shoe shoe1 = new Shoe();
            shoe1.setCode("S150");
            shoe1.setDescription("Coke - Cherry");
            shoe1.setPrice(75.00);
            shoe1.setSize(10);

            Shoe shoe2 = new Shoe();
            shoe2.setCode("S250");
            shoe2.setDescription("Coke - Vanilla");
            shoe2.setPrice(75.00);
            shoe2.setSize(9);

            Shoe shoe3 = new Shoe();
            shoe3.setCode("S350");
            shoe3.setDescription("Dr. Pepper");
            shoe3.setPrice(75.00);
            shoe3.setSize(6);

            Shoe shoe4 = new Shoe();
            shoe4.setCode("S450");
            shoe4.setDescription("Fanta - Orange");
            shoe4.setPrice(75.00);
            shoe4.setSize(11);

            GenericQueue<Product> shoes = new GenericQueue<Product>();
            shoes.enqueue(shoe1);
            shoes.enqueue(shoe2);
            shoes.enqueue(shoe3);
            shoes.enqueue(shoe4);

            return shoes;

        }

        else
        {
            GenericQueue<Product> empty = new GenericQueue<Product>();
            return empty;
        }

    }
}
