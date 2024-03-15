import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class shoppingclient {
    public static void main(String[] args) {
        // main method for the whole program

        // creating the JFrame
        JFrame frame = new JFrame("THE EVERYTHING SHOP");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // creating the panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(Color.PINK);

        // add a welcome label
        JLabel welcomeLabel = new JLabel("WELCOME TO THE SHOP OF EVERYTHING");
        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
        mainPanel.add(welcomeLabel, BorderLayout.NORTH);

        // add button to proceed to purchasing
        JButton proceedButton = new JButton("PROCEED TO PURCHASING");
        mainPanel.add(proceedButton, BorderLayout.CENTER);

        // Add action listener to proceed button
        proceedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create checkbox panel
                JPanel checkboxPanel = new JPanel();
                checkboxPanel.setLayout(new GridLayout(0, 1));

                // Add checkboxes
                JCheckBox dysonCheckbox = new JCheckBox("Dyson Hairdryer");
                JCheckBox cartierCheckbox = new JCheckBox("Cartier Watch");
                JCheckBox birkinCheckbox = new JCheckBox("Birkin Kelly");
                dysonCheckbox.setSelected(true);
                cartierCheckbox.setSelected(true);
                birkinCheckbox.setSelected(true);
                checkboxPanel.add(dysonCheckbox);
                checkboxPanel.add(cartierCheckbox);
                checkboxPanel.add(birkinCheckbox);

                // Add dropdown menu
                JComboBox<Integer> quantityDropdown = new JComboBox<>();
                for (int i = 1; i <= 10; i++) {
                    quantityDropdown.addItem(i);
                }
                checkboxPanel.add(quantityDropdown);

                // add calculate total button
                JButton calculateButton = new JButton("Calculate my total");
                checkboxPanel.add(calculateButton);

                // add action listener to calculate button
                calculateButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int totalCost = 0;
                        int quantity = (int) quantityDropdown.getSelectedItem();
                        if (dysonCheckbox.isSelected()) {
                            totalCost += 1000 * quantity;
                        }
                        if (cartierCheckbox.isSelected()) {
                            totalCost += 1000 * quantity;
                        }
                        if (birkinCheckbox.isSelected()) {
                            totalCost += 1000 * quantity;
                        }
                        JOptionPane.showMessageDialog(null, "Your total cost is: $" + totalCost);
                    }
                });

                JOptionPane.showMessageDialog(null, checkboxPanel, "Select Items", JOptionPane.PLAIN_MESSAGE);
            }
        });

        frame.add(mainPanel);
        frame.setVisible(true);
    }
}



