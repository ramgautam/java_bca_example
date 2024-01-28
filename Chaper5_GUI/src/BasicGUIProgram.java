import javax.swing.*;

public class BasicGUIProgram {
    private JFrame frame;
    private JButton button;
    private JLabel label;

    private JTextField fullNameTextField;
    public BasicGUIProgram() {
        frame = new JFrame("Basic GUI Program"); // Create a new JFrame
        frame.pack();
        button = new JButton("Click Me"); // Create a new JButton

        label = new JLabel("test label");

        fullNameTextField= new JTextField();
        fullNameTextField.setText("test");


        label.setBounds(30, 50, 100, 10);
        fullNameTextField.setBounds(40,70,100,20);

        // Set the size and layout of the frame
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the program when the frame is closed
        frame.setLayout(null); // No layout manager

        // Set the size and position of the button
        button.setBounds(100, 50, 100, 30);
        button.setToolTipText("test tool tips text");

        frame.add(fullNameTextField);

        frame.add(label);
        // Add the button to the frame
        frame.add(button);

        // Make the frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new BasicGUIProgram();
    }
}
