package event_delegation;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDelegationExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Event Delegation Example");

        // Create a JButton
        JButton button = new JButton("Click Me");

        // Register an ActionListener with the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Event handling code
                System.out.println("Button clicked!");
            }
        });

        // Add the button to the frame
        frame.getContentPane().add(button);

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 100);
        frame.setVisible(true);
    }
}
