package Module_4.BowlingShopApp;

//Superclass Product
public class Product {
    
    //Sets data fields
    private String code;
    private String description;
    private double price;

    //Default constructor that sets a default product
    Product()
    {
        code = "";
        description = "";
        price = 0;
    }

    //Accessor and mutators for all three data fields
    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    //Override the toString() method
    @Override
    public String toString()
    {
        String newProduct = String.format( this.code + "\n" + this.description + "\n" + this.price);
        //System.out.println("Testing product" + newProduct);
        return newProduct;
    }


}

//Subclass of ball
 class Ball extends Product {

    //Sets data fields
    private String color;

    //Default constructor sets a default ball
    Ball()
    {
        super();
        color = "";
    }

    //Accessor and mutator for color
    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }
    

    //Override toString()
    @Override
    public String toString()
    {
        String newColor = String.format("Product Code: %s \nDescription: %s \nPrice: $%.2f \nColor: %s", super.getCode(), super.getDescription(), super.getPrice(), this.color);
        return newColor;
    }
}

//Subclass of Bag
class Bag extends Product{

    //Sets data fields
    private String type;

    //Constructor that creates a default bag
    Bag()
    {
        super();
        type = "";
    }

    //Accessor and mutator for type
    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    //Override toString()
    @Override
    public String toString(){

        String newBag = String.format("Product Code: %s \nDescription: %s \nPrice: $%.2f \nType: %s", super.getCode(), super.getDescription(), super.getPrice(), this.type);
        return newBag;
    }

}

//Subclass for shoes
class Shoe extends Product{

    //Sets Data fields
    private double size;

    //Default constructor that sets default shoe size
    Shoe()
    {
        super();
        size = 0;
    }

    //Accessor and Mutator for size
    public double getSize()
    {
        return size;
    }

    public void setSize(double size)
    {
        this.size = size;
    }

    

    //Override toString()
    @Override
    public String toString()
    {
        String newShoe = String.format("Product Code: %s \nDescription: %s \nPrice: $%.2f \nSize: %s", super.getCode(), super.getDescription(), super.getPrice(), this.size);
        return newShoe;
    }

}