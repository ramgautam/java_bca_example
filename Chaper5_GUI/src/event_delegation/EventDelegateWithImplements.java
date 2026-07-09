package event_delegation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDelegateWithImplements implements ActionListener {
    private JButton button;
    private JButton button1;

    public EventDelegateWithImplements() {
        // Create a JFrame
        JFrame frame = new JFrame("ActionListener Example");

        // Create a JButton
        button = new JButton("Click Me");
        button1 = new JButton("Next Button");

        // Register this ActionListener with the button
        button.addActionListener(this);
        button1.addActionListener(this);

        frame.setLayout(new FlowLayout());
        // Add the button to the frame
        frame.getContentPane().add(button);
        frame.getContentPane().add(button1);

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 100);
        frame.setVisible(true);
    }

    // ActionListener implementation
    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle button click event
        if (e.getSource() == button) {
            // Show a message dialog when the button is clicked
            JOptionPane.showMessageDialog(null, "Button Clicked!");
            System.out.println("Button clicked!");
        }
        if (e.getSource() == button1) {
            // Show a message dialog when the button is clicked
            JOptionPane.showMessageDialog(null, "Button1 Clicked!");
            System.out.println("Button1 clicked!");
        }
    }

    public static void main(String[] args) {
        // Create an instance of ActionListenerExample
        new EventDelegateWithImplements();
    }
}
