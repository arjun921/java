import java.awt.*;
import java.applet.*;
import java.awt.event.*;

class myClass extends Applet{
	public static void main(String[] args){
	Frame frame = new Frame("My First Frame");
	frame.setSize(500,500);
	Applet app = new myClass();
	frame.add(app);
	frame.setVisible(true);
	frame.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	});
}

public void paint(Graphics g){
	g.drawString("Hello world",50,50);
}
}
