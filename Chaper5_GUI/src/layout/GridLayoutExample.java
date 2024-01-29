package layout;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Grid Layout Example");

        // Create a panel with GridLayout (3 rows, 3 columns)
        frame.setLayout(new GridLayout(3, 3));

        // Add buttons to the panel
        for (int i = 1; i <= 9; i++) {
            frame.add(new JButton("Button " + i));
        }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
