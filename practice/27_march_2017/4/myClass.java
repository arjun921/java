import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class myClass extends Applet implements ActionListener{
	Button yes, no, maybe;
	String msg=" ";
	public void init(){
		yes = new Button("Yes");
		no = new Button("No"); 
		maybe = new Button("Maybe");
		
		add(yes);
		add(no);
		add(maybe);		

		yes.addActionListener(this);
		no.addActionListener(this);
		maybe.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent ae){
		String str=ae.getActionCommand();
		if(str.equals("Yes")){
			msg="Pressed Yes";
		}
		else if(str.equals("No")){
			msg="Pressed No";
		}
		else{
			msg="Pressed Maybe";
		}
		repaint();
	}
	public void paint(Graphics g){
		g.drawString(msg,10,50);
	}
}