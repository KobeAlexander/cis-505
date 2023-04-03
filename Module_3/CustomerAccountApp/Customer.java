package Module_3.CustomerAccountApp;

public class Customer {
    
    //Decalring Variables
    private String name;
    private String address;
    private String city;
    private String zip;

    //A no-argument constructor that sets the variables in their default
    public Customer()
    {
        
    }

    //An argument constructor that creates a customer using the four data fields
    public Customer(String name, String address, String city, String zip)
    {
        this.name = name;
        this.address = address;
        this.city = city;
        this.zip = zip;
    }

    //Accessors for all variabls
    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public String getCity()
    {
        return city;
    }

    public String getZip()
    {
        return zip;
    }

    @Override
    public String toString()
    {
        String customerDetail = "Name: " + this.name + "\nAddress: " + this.address + "\nCity: " + this.city + "\nZip: " + this.zip;
        //Testing - System.out.println(customerDetail);
        return customerDetail;

    }
}
