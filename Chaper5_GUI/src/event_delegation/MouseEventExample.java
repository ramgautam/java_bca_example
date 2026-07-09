package event_delegation;

import javax.swing.*;
import java.awt.event.*;

public class MouseEventExample extends JFrame implements MouseListener {

    public MouseEventExample() {
        setTitle("Mouse Event Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click Me");
        add(button);

        button.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        JOptionPane.showMessageDialog(this, "Mouse Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Not used in this example
        JOptionPane.showMessageDialog(this, "Mouse Pressed");

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Not used in this example
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Not used in this example
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Not used in this example
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MouseEventExample example = new MouseEventExample();
            example.setVisible(true);
        });
    }
}

