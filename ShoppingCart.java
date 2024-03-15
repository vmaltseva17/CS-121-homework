import java. util. ArrayList;
// array list is resizable array implementation of the list interface in java
public class ShoppingCart
    // declares class called shopping cart
{
    private ArrayList<ItemOrder> shoppingcart = new ArrayList<ItemOrder>();

    // declares private variable of type arraylist<itemOrder> and initializes it
    public ShoppingCart(){}

    // declares constructor for shopping cart class
    public void add(ItemOrder itemOrder)

    // method used using inheritance to add an item to the shopping cart using the previously defined item order class
    {
        shoppingcart. add (itemOrder) ;
        // this adds an item order to the shopping cart array list
    }
    public void remove (ItemOrder removeItemOrder)
            // method removes the item order from the shopping cart array
    {
        shoppingcart. remove (removeItemOrder) ;
    }
    public boolean searchItem (ItemOrder searchOrder)
            // searches for an item order in the shopping cart
    {
        boolean found=false;
        // declares variable of type boolean and initializes it to false

        for(int index=0;index<shoppingcart.size () ;index++)
            // starts a for loop that iterates over the array
        {
            if (searchOrder. equals (shoppingcart. get (index) ))
                // equals method to check whether the search order is at the same index as the item order in the shopping cart array
                found=true;
            // sets the found variable to true if the search order is found in the shopping cart
        }
        return found;
        // returns the value of the found variable to say whether the search order is in the shopping cart
    }
    public double getTotalCost()
            // method that returns a double and calculates the total cost of the all the items in the shopping cart
    {
        double totalCost=0;
        // variable of type double which will hold the total cost of the order and is initalized to zero
        for(int index=0;index<shoppingcart.size();index++)
        // for loop that iterates over the array list shopping cart
        {
            ItemOrder itemorder=shoppingcart. get (index) ;
            // retrieves the item order at the current index in the shopping cart
            totalCost+=itemorder.getItemOrderCost ();
            // adds the prices using inheritance which updates the total cost variable
        }
        return totalCost;
        // returns the value of the total cost variable
    }
}