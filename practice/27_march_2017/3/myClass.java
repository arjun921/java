import java.awt.*;
import java.applet.*;

public class myClass extends Applet{
	public void paint(Graphics g){
		g.fillRect(50,50,120,120);

	}

	public void init(){
		add(new Label("Label One"));
		add(new Label("Label Two", Label.RIGHT));
		Button button = new Button("Submit");
		add(button);
		Checkbox c = new Checkbox("Select this checkbox",true);
		add(c);
	}
}