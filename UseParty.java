
import java.util.Scanner;

public class UseParty {
    public static void main(String[] args) {
        int guestNumber;
        Party party;
        Scanner scanner = new Scanner(System.in);

        //prompting the user for the number of guests

    System.out.println("Enter the number of guests:");
    guestNumber = scanner.nextInt();

    // create a party object and set the number of guests
        party = new Party(guestNumber);
       System.out.println("Number of guests:" + party.getGuests());

     // display the party invitation

     party.displayInvitation();

     // close the scanner
   scanner.close();
  }
  }
class beautifuldinner {
    {
        int guestnumber;
        int choosedinner;
        DinnerParty thisdinnerparty;
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many people will be at your party?");
        guestnumber = scanner.nextInt();

        thisdinnerparty = new DinnerParty(guestnumber, 1);

        System.out.println("What would you like for dinner? press 1 for chicken and 2 for Vegetables");
        choosedinner = scanner.nextInt();
        thisdinnerparty.setDinner(choosedinner);

        System.out.println("Specifics of my dinner party:");
        System.out.println("Number of people coming" + thisdinnerparty.getGuests());
        System.out.println("Dinner choice:" + thisdinnerparty.getDinner());

        thisdinnerparty.displayInvitation();

        scanner.close();

    }

}