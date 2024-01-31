package event_delegation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDelegateWithImplements implements ActionListener {
    private JButton button;

    public EventDelegateWithImplements() {
        // Create a JFrame
        JFrame frame = new JFrame("ActionListener Example");

        // Create a JButton
        button = new JButton("Click Me");

        // Register this ActionListener with the button
        button.addActionListener(this);

        // Add the button to the frame
        frame.getContentPane().add(button, BorderLayout.CENTER);

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
    }

    public static void main(String[] args) {
        // Create an instance of ActionListenerExample
        new EventDelegateWithImplements();
    }
}
