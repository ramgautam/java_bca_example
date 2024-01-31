package event_delegation;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class DelegationEventModelDemo {

    public static void main(String[] args) {

        // Step 1: Creating Custom Events

        class CustomButtonClickEvent extends java.util.EventObject {

            public CustomButtonClickEvent(Object source) {

                super(source);

            }

        }

        // Step 2: Implementing Event Listeners

        class ActionButtonClickListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {

                // Show a message dialog when the button is clicked

                JOptionPane.showMessageDialog(null, "Button Clicked!");

            }

        }

        // Step 3: Registering and Handling Events

        Frame frame = new Frame("Delegation Event Model Demo");

        frame.setLayout(new FlowLayout());

        Button button = new Button("Click Me!");

        frame.add(button);

        ActionButtonClickListener actionButtonClickListener = new ActionButtonClickListener();

        button.addActionListener(actionButtonClickListener);

        frame.setSize(300, 200);

        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {


                // Show a confirm  dialog when the button is clicked

                int option = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirmation", JOptionPane.YES_NO_OPTION);

                if (option == JOptionPane.YES_OPTION) {
                    // User clicked Yes
                    System.out.println("User clicked Yes");
                    System.exit(0);
                } else {
                    // User clicked No or Closed the dialog
                    System.out.println("User clicked No or Closed the dialog");
                }

            }

        });

    }

}