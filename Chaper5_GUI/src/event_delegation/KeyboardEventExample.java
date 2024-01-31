package event_delegation;

import javax.swing.*;
import java.awt.event.*;

public class KeyboardEventExample extends JFrame {

    public KeyboardEventExample() {
        setTitle("Keyboard Event Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField textField = new JTextField();
        add(textField);

        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_ENTER) {
                    String text = textField.getText();
                    JOptionPane.showMessageDialog(KeyboardEventExample.this, "You entered: " + text);
                }
//                if (keyCode == KeyEvent.VK_SPACE) {
//                    String text = textField.getText();
//                    JOptionPane.showMessageDialog(KeyboardEventExample.this, "Space bar keyboard pressed");
//                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            KeyboardEventExample example = new KeyboardEventExample();
            example.setVisible(true);
        });
    }
}

