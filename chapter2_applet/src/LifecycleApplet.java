import java.applet.Applet;
import java.awt.*;

public class LifecycleApplet extends Applet {

    private Color backgroundColor;

    public void init() {
        System.out.println("Init method called");

        // Retrieve the parameter named "bgColor" from the HTML code
        String colorParam = getParameter("bgColor");
        String message = getParameter("message");

        System.out.println("background color from param:"+colorParam);
        System.out.println("message:"+message);

        // If the parameter exists and represents a valid color, set the background color
        if (colorParam != null) {
            try {
                backgroundColor = Color.decode(colorParam);
                setBackground(backgroundColor);
            } catch (NumberFormatException e) {
                System.err.println("Invalid color value: " + colorParam);
            }
        } else {
            // Default background color if parameter not provided or invalid
            backgroundColor = Color.WHITE;
            setBackground(backgroundColor);
        }
        // Initialization code goes here
    }

    public void start() {
        System.out.println("Start method called");
        // Start code goes here
    }

    public void stop() {
        System.out.println("Stop method called");
        // Stop code goes here
    }

    public void destroy() {
        System.out.println("Destroy method called");
        // Cleanup code goes here
    }

    public void paint(Graphics g) {
        g.drawString("Lifecycle Applet", 20, 20);
        // Display the color value on the applet window
        g.setColor(Color.RED);
        g.drawString("Background color: " + backgroundColor.toString(), 30, 30);
        // Drawing or displaying content code goes here
    }
}
