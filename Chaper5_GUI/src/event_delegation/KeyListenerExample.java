package event_delegation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyListenerExample extends JFrame implements KeyListener {

    JTextField textField;
    JLabel label;

    KeyListenerExample() {
        // Frame setup
        setTitle("KeyListener Example");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create components
        textField = new JTextField(20);
        label = new JLabel("Press any key...");

        // Add KeyListener to text field
        textField.addKeyListener(this);

        // Add components to frame
        add(new JLabel("Type here: "));
        add(textField);
        add(label);

        setVisible(true);
    }

    // Implement methods of KeyListener
    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        label.setText("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));

        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            label.setText("You entered: " + textField.getText());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        new KeyListenerExample();
    }
}
