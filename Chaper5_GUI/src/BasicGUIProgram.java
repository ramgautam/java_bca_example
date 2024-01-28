import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class BasicGUIProgram {
    private JFrame frame;
    private JButton button;

    public BasicGUIProgram() {
        frame = new JFrame("Basic GUI Program"); // Create a new JFrame
        frame.pack();
        button = new JButton("Click Me"); // Create a new JButton

        // Set the size and layout of the frame
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the program when the frame is closed
        frame.setLayout(null); // No layout manager

        // Set the size and position of the button
        button.setBounds(100, 50, 100, 30);

        // Add the button to the frame
        frame.add(button);

        // Make the frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new BasicGUIProgram();
    }
}
