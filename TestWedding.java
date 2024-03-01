import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.*;

public class TestWedding {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(1987, 2, 18);
        LocalDate date2 = LocalDate.of(1972, 5, 31);
        LocalDate date3 = LocalDate.of(2002, 4, 23);


        Person groom1 = new Person("Alexander", "Maltsev", date1);
        Person bride1 = new Person("Vera", "Tararova", date2);


        Couple couple1 = new Couple(bride1, groom1);


        Wedding wedding1 = new Wedding(couple1, date3, "Donetsk National Park");


        displayWeddingDetails(wedding1);



    // creating the GUI window

    JFrame frame = new JFrame("Wedding Invitation");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1000, 1000);

    // creating JPanel to hold GUI components

    JPanel panel = new JPanel();
   panel.setLayout(new FlowLayout());

    // set JLabel with wedding invitation message
    JLabel invitationLabel = new JLabel("You have been invited to my wedding! ");
    panel.add(invitationLabel);
    invitationLabel.setFont(new Font("Verdana", Font.PLAIN, 24));

        // adding JTextArea message to leave a heartwarming message

    // create JButton to display wedding details

    JButton detailsbutton = new JButton("Details of my wedding");
    panel.add(detailsbutton);

        JTextArea message = new JTextArea("Any notes for the couple?");
        panel.add(message);
        detailsbutton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JLabel dateOf = new JLabel("Our wedding will be on the 23rd of April!");
            dateOf.setFont(new Font("Verdana", Font.PLAIN, 24));
            panel.add(dateOf);
            JLabel thecouple = new JLabel("Alex & Vera's Wedding");
            thecouple.setFont(new Font("Verdana", Font.PLAIN, 24));
            panel.add(thecouple);
            JLabel thelocation = new JLabel("Come join us in Donestk National Park for a very traditional russian wedding!");
            thelocation.setFont(new Font("Verdana", Font.PLAIN, 24));
            panel.add(thelocation);
            JButton translate = new JButton("Translate to Russian");
            panel.add(translate);
            // refresh the page 
            frame.revalidate();
            frame.repaint();
            translate.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    dateOf.setText("Наша свадьба будет 23 апреля.");
                    thecouple.setText("Свадьба Саши и Веры");
                    thelocation.setText("Наша свадьба будет в Донецке");

                }
            });
        }
    });


        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
    public static void displayWeddingDetails(Wedding w) {
        Couple couple = w.getCouple();
        LocalDate weddingDate = w.getWeddingDate();
        String location = w.getLocation();

        Person bride = couple.getBride();
        Person groom = couple.getGroom();

        String firstBride = bride.getFirstName();
        String lastBride = bride.getLastName();
        LocalDate brideBDate = bride.getBirthDate();

        String firstGroom = groom.getFirstName();
        String lastGroom = groom.getLastName();
        LocalDate groomBDate = groom.getBirthDate();

        System.out.println("\n" + lastBride + "/" + lastGroom + " Wedding");
        System.out.println("Date: " + weddingDate + "   Location: " + location);
        System.out.println("Bride: " + firstBride + " " + lastBride + " " + brideBDate);
        System.out.println("Groom: " + firstGroom + " " + lastGroom + " " + groomBDate);




    }
}

