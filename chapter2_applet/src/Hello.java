import java.applet.Applet;
import java.awt.*;

public class Hello extends Applet {
	public void init() {
		repaint();
	}

	public void paint(Graphics g) {
		g.drawString("Hello World!", 30, 30);
	}
}