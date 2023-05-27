package Module_3.CustomerAccountApp;
public class CustomerDB {

    Customer Kobe = new Customer("Kobe Alexander", "6509 s89th Cir", "Ralston", "68127");
    Customer Alyssa = new Customer("Alyssa Alexander", "6509 s89th Cir", "Ralston", "68127");
    Customer Liz = new Customer("Liz Bernhart", "6509 s89th Cir", "Ralston", "68127");
    Customer Default = new Customer();
    
    public Customer getCustomer(int customerIDString, Customer customersName)
    {
       

        if (customerIDString == 1007)
        {
            return Kobe;
        }
            else if ( customerIDString == 1008)
            {
                return Alyssa;
            }
                else if (customerIDString == 1009)
                {
                    return Liz;
                }
                    else 
                    {
                        return Default;
                    }

    }
}
