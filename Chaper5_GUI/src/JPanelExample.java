import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;

public class JPanelExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("JPanel Example");

        // Create a JPanel with FlowLayout
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Add buttons to the panel
        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));

        // Add the panel to the JFrame
        frame.add(panel);

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
