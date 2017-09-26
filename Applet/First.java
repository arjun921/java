import java.applet.*;
import java.awt.*;

public class First extends Applet{
	public void paint(Graphics g){
		g.drawString("Name",70,90);
		g.drawString("College",70,120);
		g.drawString("State",70,150);
		//x,y,width,height
		g.drawRect(50,50,300,300);
	}
}

// <applet code="First.class" height="400" width="400"></applet>