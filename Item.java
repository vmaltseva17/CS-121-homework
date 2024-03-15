public class Item
    // declares new Item class
{
    private String itemName;

    // declares a private instance variable named itemName
    private double price;

    // declares a private instance variable named price which is of type double
    public Item(String itemName, double price)

    // declares a constructor for the item class that takes as parameters the two variables declared before
    {
        setItem(itemName, price);

        //calls the setItem method for the previous variables
    }
    public void setItem(String itemName,double price)
            // declares a public method that takes two parameters
    {
        this.setItemName(itemName);

        // calls the setItemName method with the provided parameter to set the variable

        this.setPrice(price);

        // calls the setPrice method with the provided parameter to set the price parameter
    }
    public String getItemName ()
            // declares public method which returns a string which is used to retrieve the value of the itemName instance variable
    {
        return itemName;

        // returns the value of the itemName variable
    }
    public void setItemName (String itemName)
            // method which sets the value of the itemName variable
    {
        this.itemName = itemName;
        // assigns the value of the itemName parameter to the itemName instance variable
    }
    public double getPrice ()
            // method which returns a double and is used to return the value of the getPrice variable
    {
        return price;

    }
    public void setPrice (double price)
            // sets the value of the price variable
    {
        this.price = price;
        // assigns the value of the price parameter to the price instance variable
    }
}