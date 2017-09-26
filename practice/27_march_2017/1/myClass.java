import java.awt.*;
import java.applet.*;

public class myClass extends Applet{
	public void paint(Graphics g){
		setForeground(Color.red);
		g.drawString("Hello World",50,50);
	}
}
