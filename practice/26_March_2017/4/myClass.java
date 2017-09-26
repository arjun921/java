import java.awt.*;
import java.applet.*;

public class myClass extends Applet{
	public void paint(Graphics g){
		setForeground(Color.red);
		g.drawString("Hello World",50,50);
		g.drawRect(25,45,70,90);
		g.fillOval(25,45,70,90);
		g.drawArc(25,200,25,25,0,180);
		showStatus("This is shown in the status window.");
	}
}