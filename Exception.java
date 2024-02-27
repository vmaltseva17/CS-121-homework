import java.util.Scanner;
// scanner allows user input to be read from the console
public class Exception {
    // class that will contain main method where execution of the code will start
    public static void main(String[] args) {
        String[] names = {"Vasilisa", "Coulton", "John", "Tom", "Jerry", "Alice", "Pawan", "Chris", "Alex", "Vera"};
        // declares and initializes an array of strings named "names"
        String integer;
        // declares a string variable named integer which will store user input
        try {
            // starts a try block which contains a code that may throw an exception
            System.out.println("Enter an integer to display a name");
            Scanner input = new Scanner(System.in);
            // creates a new Scanner object named input to read input from the console
            integer = input.nextLine();
            // reads a line of input from the console and assigns it to the "integer" variable
            int i = Integer.parseInt(integer);
            // attempts to parse a string input into an integer
            i = i - 1;
            // decrements the value of i by 1
            System.out.println(names[i]);
            // prints the name corresponding to the index 'i' in the 'names' array
            input.close();
            // closes scanner object to release system resources
        } catch (ArrayIndexOutOfBoundsException e) {
            // catches if the index is out of bounds of the array 
            System.out.println("Your number is out of range");
        }
    }
}



