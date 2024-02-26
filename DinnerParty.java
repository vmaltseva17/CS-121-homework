
public class DinnerParty extends Party {
    private int chooseDinner;

    // constructor

public DinnerParty(int guestNumber, int chooseDinner) {
    super(guestNumber);
    this.chooseDinner = chooseDinner;
}


// method to get the dinner choice
    public int getDinner() {
        return chooseDinner;
    }
 // method to set the dinner choice

 public void setDinner(int chooseDinner) {
     this.chooseDinner = chooseDinner;


 }
}
