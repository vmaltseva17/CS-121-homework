//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //creates a scanner object to read user input
        System.out.print("The amount in dollars is: $");
        double dollars = sc.nextDouble();
        //declaration: declares a variable named "dollars" of type 'double', which means it can store decimal numbers
        //initialisation: this line of code then uses the "scanner" to read the user input from the console
        //"scanner.nextDouble()" reads the next token of input as a double
        // assignment: the value entered by the user is assigned to the "dollars" variable
        sc.close();
        //close scanner to avoid a resource leak
        int cents = (int) (dollars * 100);
        //converts the amount to cents for an easier calculation
        //cents is a variable of type "int" and the ("int") before the multiplication is a type cast which converts the result of the multiplication into an integer
        int quarters = cents / 25;
        int remainingcents1 = cents % 25;
        int dimes = remainingcents1 / 10;
        remainingcents1 %= 10;
        int nickels = remainingcents1 / 5;
        // displaying the result
        System.out.println("\u001B[32m" + "For $" + "\u001B[0m" + dollars + ":");
        System.out.println(quarters + " \u001B[36m" + " quarters" + "\u001B[0m" );
        System.out.println(dimes + " \u001B[36m" + " dimes" + "\u001B[0m");
        System.out.println(nickels + "\u001B[33m" + " nickels" + "\u001B[0m");
    }
}




