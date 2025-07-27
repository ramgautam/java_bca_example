import java.applet.Applet;
import java.awt.*;

public class ParameterPassingApplet extends Applet {
    private String message;

    public void init() {
        // Retrieve the parameter named "message" from the HTML code
        message = getParameter("message");
        if (message == null) {
            message = "No message provided";
        }
        System.out.println("message from Aplet viewer"+ message);
    }

    public void paint(Graphics g) {
        // Display the message on the applet window
        g.drawString(message, 20, 20);
    }
}

