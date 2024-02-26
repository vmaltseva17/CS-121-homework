
public class Party {
    private int guestNumber;

    // constructor

    public Party(int guestNumber) {
        this.guestNumber = guestNumber;
    }

    // method to get number of guests

    public void setGuests(int guestNumber){
        this.guestNumber = guestNumber;
    }

    public int getGuests() {
        return guestNumber;
    }

            // method to display invitation
    public void displayInvitation() {
        System.out.println("Please come to my party!");
    }


        }


