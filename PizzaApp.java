// final pizza project
// go over code structure and creativity w/ TA on sunday
// three tasks: fix mistakes, add functionality to the calculatebutton so it displays the final price that has been displayed
// add code after button4 to hide the initial pizza selection

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;

// creating a constructor - do I need one for every class that is not implemented?
public class PizzaApp extends JFrame {

    public JPanel panel1, panel4, panel5;
    public JButton button1, button2, button3, button4, calculateButton, button5, button12;
    public JLabel label2, label3, totalPriceLabel;


    public JCheckBox checkbox1, checkbox2, checkbox3, checkbox4;

    public JComboBox delivery;

    double PriceCounter = 0;

    double toppings = 0;
    
    double finalprice;

    // class pizza app
    public PizzaApp() {
        // setting out the layout
        setTitle("Big Y Pizza Order");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());
        panel1 = new JPanel(new FlowLayout());
        panel1.setPreferredSize(new Dimension(600,500));
        panel4 = new JPanel(new FlowLayout());
        panel5 = new JPanel(new FlowLayout());
        label2 = new JLabel("Choose your pizza size");
        label2.setFont(new Font("Verdana", Font.BOLD, 36));


        this.add(panel1, BorderLayout.NORTH);
        panel1.add(label2);
        
        // adding the buttons to choose the pizza size
        // depending on the button clicked the price counter variable is updated

        button1 = new JButton("Small Pizza: $5");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                PriceCounter += 5;
                System.out.println("Small");
            }
        });
        panel1.add(button1);

        button2 = new JButton("Medium Pizza: $10");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PriceCounter += 10;
                System.out.println("Medium");
            }
        });

        panel1.add(button2);

        button3 = new JButton("Large Pizza: $15");
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PriceCounter += 15;
                System.out.println("Large");
            }
        });
        panel1.add(button3);
        
        // hiding the panel and making the next panel appear - how do i make them appear in a consecutive order
        // new panel contains checkboxes for toppings
        // new panel contains drop down menu to choose delivery service

        button4 = new JButton("Next Step");
        panel1.add(button4);

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remove(panel1);
                add(panel4);
                revalidate();
                repaint();
            }
        });


        label2 = new JLabel("What toppings would you like?");

        checkbox1 = new JCheckBox("Mushroom");

        checkbox2 = new JCheckBox("Meat");

        checkbox3 = new JCheckBox("Chicken");

        checkbox4 = new JCheckBox("Cheese");
        panel4.add(checkbox1);
        panel4.add(checkbox2);
        panel4.add(checkbox3);
        panel4.add(checkbox4);


        checkbox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (checkbox1.isSelected())
                    toppings += 0.5;
                else toppings -= 0.5;
            }
        });
        checkbox2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (checkbox2.isSelected())
                    toppings += 0.5;
                else toppings -= 0.5;

            }
        });
        checkbox3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (checkbox3.isSelected())
                    toppings += 0.5;
                else toppings -= 0.5;
            }
        });
        checkbox4.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (checkbox4.isSelected())
                    toppings += 0.0;
                else toppings -= 0.0;
            }
        });

        button5 = new JButton("Next Step");
        panel4.add(button5);
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remove(panel4);
                add(panel5);
                revalidate();
                repaint();

            }
        });

        panel5 = new JPanel(new FlowLayout());
        add(panel5, BorderLayout.CENTER);

        // class to update the toppings variable depending on the amount of toppings clicked
        // code to actually make the drop down menu combo box woek
        String[] options = {"Home Delivery", "Eat at Restaurant", "Send to a friend"};
        JComboBox<String> dropdown = new JComboBox<>(options);
        this.add(dropdown);

        totalPriceLabel = new JLabel();
        calculateButton = new JButton("Calculate Total");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                finalprice = PriceCounter + toppings;
                if (toppings == 1.5)
                    finalprice -= 0.25;
                System.out.println("Your Total is " + "$"  + finalprice );
                totalPriceLabel.setText("Your Total is " + "$" + finalprice );
            }
        });

        panel5.add(calculateButton);
        panel5.add(dropdown);
        totalPriceLabel = new JLabel();
        panel5.add(totalPriceLabel);


    }

    public static void main(String[] args) {
        PizzaApp pizzaApp = new PizzaApp();
        pizzaApp.setVisible(true);

    }






}