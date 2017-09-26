import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class myClass extends Applet implements ActionListener{
	Button but;
	String msg=" ";
	int count=0;
	public void init(){
		but = new Button("Move Right");
		add(but);
		but.addActionListener(this);

	}

	public void actionPerformed(ActionEvent ae){
		String str=ae.getActionCommand();
		if(str.equals("Move Right")){
			count+=10;
			msg=String.valueOf(count);
		}
		repaint();
	}

	public void paint(Graphics g){
		g.drawOval(count,10,50,50);

	}
}