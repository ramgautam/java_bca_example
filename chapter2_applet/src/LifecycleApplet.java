import java.applet.Applet;
import java.awt.*;

public class LifecycleApplet extends Applet {

    public void init() {
        System.out.println("Init method called");
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
        // Drawing or displaying content code goes here
    }
}
