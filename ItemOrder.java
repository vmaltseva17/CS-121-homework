public class ItemOrder
    // declares public class itemOrder
{
    private int quantity;

    // declares private instance variable named quantity of type integer
    private Item item;

    // declares private instance variable item which will hold the name associated with the order
    public ItemOrder (Item item, int quantity)

    // declares constructor for the itemOrder class which takes two parameters
    {
        this.item=item;

        // assigns the value of the item parameter to the item variable
        this. setQuantity (quantity);
        // calls the set quantity method with the quantity parameter to set the quantity variable
    }
    public int getQuantity ()
            // method that returns an integer and is used to retrieve the value of the quantity variable
    {
        return quantity;
    }
    public void setQuantity (int quantity)
            // method used to set the quantity of the instance variable
    {
        this. quantity = quantity;
        // assigns the value of the quantity parameter to the quantity variable
    }
    public double getItemOrderCost()
            // declares a public method that returns a double
    {
        double itemOrderCost=0;
        // declares a local variable and initializes it to zero
        // this variable will hold the total cost of the item order

        if (quantity%2==0)
        // if statement which checks if the quantity is even

        {
            for (int index=0;index<quantity/2;index++)
                // starts a for loop that iterates over half of the quantity

                itemOrderCost+=4.0;

            // adds 4 to the local variable for each iteration of the for loop

            return itemOrderCost;

        }
        else
        // else statement which executes if the quantity is odd
        {
            for(int index=0;index<quantity/2;index++)
                itemOrderCost+=4.0;
            // same thing as before
            return itemOrderCost+item.getPrice();

            // returns the sum of the order cost addded to the price of the item which gives you the total cost for the item
        }
    }
}