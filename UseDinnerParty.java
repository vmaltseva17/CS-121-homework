

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;


public class UseDinnerParty  {
   public static void main (String[] args) {
       int guestNumber;
       int chooseDinner;
       DinnerParty myDinnerParty;
       Scanner scanner  = new Scanner(System.in);


       JFrame frame = new JFrame();
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mypanel = new JPanel(new GridLayout(7,1));
        mypanel.setBackground(Color.PINK);


        // prompting the user to enter the number of guests for the dinner party

      JLabel numberofpeople = new JLabel("How many people are coming to your dinner party?");
      numberofpeople.setBounds(50,60,50,60);
      numberofpeople.setFont( Font.getFont("Didot"));
      mypanel.add(numberofpeople);

      // issue with the JTextfield
       JTextField people = new JTextField("Please enter the number of people coming:");
       people.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
            String answer = people.getText();
            double theiranswer = Double.parseDouble(answer);

           }

      });
       mypanel.add(people);
       System.out.println("How many people are coming to your dinner party?");
       guestNumber = scanner.nextInt();

        // create a dinner party object and set the number of guests

       myDinnerParty = new DinnerParty(guestNumber, 13);

        // prompt the user for the dinner choice
       JLabel dinnerchoice = new JLabel("What would you like for dinner? Click 1 for chicken and 2 for Vegetables");
     dinnerchoice.setBounds(50,60,50,60);
     dinnerchoice.setFont(Font.getFont("Didot"));
     mypanel.add(dinnerchoice);

     String[] options = {"Option 1: Chicken", "Option 2: Vegetables"};
     JComboBox<String> dropdown = new JComboBox<>(options);
     mypanel.add(dropdown);
     System.out.println("What would you like for dinner? Press 1 for chicken and 2 for Vegetables");
     chooseDinner = scanner.nextInt();
     myDinnerParty.setDinner(chooseDinner);


    // display the data for the dinner party

     System.out.println("Specifics of my dinner party:");
     System.out.println("Number of people coming" + myDinnerParty.getGuests());


    System.out.println("Dinner choice:" + myDinnerParty.getDinner());
    dropdown.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            String choice = (String) dropdown.getSelectedItem();
            dinnerchoice.setText("Dinner Choice" + choice);
        }

    });
        // display the invitation for the dinner party

       JLabel invite = new JLabel("Please come to my party!");
       invite.setFont(Font.getFont("Didot"));
       myDinnerParty.displayInvitation();
       myDinnerParty = new DinnerParty(0,0);
       mypanel.add(invite);

        // close scanner

       scanner.close();


       frame.add(mypanel);
       frame.setVisible(true);

    }
}