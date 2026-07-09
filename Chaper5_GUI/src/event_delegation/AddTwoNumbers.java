package event_delegation;

import javax.swing.*;
import java.awt.event.*;

public class AddTwoNumbers extends JFrame implements ActionListener {
    // UI Components
    private JTextField num1Field, num2Field, resultField;
    private JButton addButton;

    public AddTwoNumbers() {
        // Frame setup
        setTitle("Add Two Numbers");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Absolute positioning

        // Labels
        JLabel num1Label = new JLabel("Number 1:");
        num1Label.setBounds(20, 20, 80, 25);
        add(num1Label);

        JLabel num2Label = new JLabel("Number 2:");
        num2Label.setBounds(20, 50, 80, 25);
        add(num2Label);

        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(20, 110, 80, 25);
        add(resultLabel);

        // Text fields
        num1Field = new JTextField();
        num1Field.setBounds(100, 20, 150, 25);
        add(num1Field);

        num2Field = new JTextField();
        num2Field.setBounds(100, 50, 150, 25);
        add(num2Field);

        resultField = new JTextField();
        resultField.setBounds(100, 110, 150, 25);
        resultField.setEditable(false); // result field should not be editable
        add(resultField);

        // Add button
        addButton = new JButton("Add");
        addButton.setBounds(100, 80, 80, 25);
        addButton.addActionListener(this); // register ActionListener
        add(addButton);

        setSize(250,120);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Get numbers from text fields
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());

            // Add and display result
            double sum = num1 + num2;
            resultField.setText(String.valueOf(sum));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers!");
        }
    }

    public static void main(String[] args) {
        new AddTwoNumbers();
    }
}

