import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("BorderLayout Example");

        // Create a JPanel with BorderLayout
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Add buttons to the panel
        JButton buttonNorth = new JButton("North");
        JButton buttonSouth = new JButton("South");
        JButton buttonEast = new JButton("East");
        JButton buttonWest = new JButton("West");
        JButton buttonCenter = new JButton("Center");

        panel.add(buttonNorth, BorderLayout.NORTH);
        panel.add(buttonSouth, BorderLayout.SOUTH);
        panel.add(buttonEast, BorderLayout.EAST);
        panel.add(buttonWest, BorderLayout.WEST);
        panel.add(buttonCenter, BorderLayout.CENTER);

        // Add the panel to the JFrame
        frame.add(panel);

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
