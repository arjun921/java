import java.awt.*;
import java.applet.*;

public class myClass extends Applet{
	public void paint(Graphics draw){
		setForeground(Color.red);
		draw.drawString("Hello World",40,70);
		// draw.drawRect(50,50,120,190);
		// draw.drawOval(20,20,150,259);
		// draw.fillOval(200,30,150,259);
		// draw.fillRect(50,50,200,200);
		//draw.drawArc(x,y,width,height,angleOfRotation,degreesOfFilledLine);
		// draw.fillArc(110,130,200,170,180,180);
		draw.drawArc(110,130,200,170,180,180);
		draw.drawLine(10,10,120,240);
	}
}
