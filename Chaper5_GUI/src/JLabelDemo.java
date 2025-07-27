import javax.swing.*;
import java.awt.*;


public class JLabelDemo extends JFrame {
    private JLabel label1, label2, label3; // Declare three JLabels

    // Set up GUI
    public JLabelDemo() {
        super("Testing JLabel");

        // Get content pane and set its layout
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        // JLabel constructor with a string argument
        label1 = new JLabel("Label with text");
        label1.setToolTipText("This is label1"); // Tooltip to guide user
        container.add(label1); // Add to container

        // JLabel constructor with string, icon and alignment arguments
        Icon bug = new ImageIcon("bug1.gif"); // Image icon
        label2 = new JLabel("Label with text and icon", bug, SwingConstants.LEFT);
        container.add(label2); // Add to container

        // JLabel constructor with only icon
        label3 = new JLabel(bug);
        label3.setToolTipText("This is label3"); // Tooltip
        container.add(label3); // Add to container

        setSize(275, 170); // Set window size
        setVisible(true);  // Make frame visible
    }

    public static void main(String[] args) {
        JLabelDemo app = new JLabelDemo();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit on close
    }
}