import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        // declare array of 20 doubles
        double arr[] = new double[20];


        int n = 0;

        // enter numbers

        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNextDouble()) {

            double mynumber = scanner.nextDouble();

            if (mynumber == 99999) {

                // stop the code by breaking out

                break;

            } else
                // otherwise add to the array/
                arr[n] = mynumber;
            n++;
        }

        scanner.close();




        // display error message if no number was entered

        if (n == 0) {
            System.out.println("There was no number available. Error. ");

            // display whole array otherwise
        } else
            for (int i = 0; i < n; i++)
            { System.out.print(arr[i]);
                System.out.print(" ");}


    }
    }



