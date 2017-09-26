import java.awt.*;
import java.applet.*;
import java.lang.*;

public class myClass extends Applet implements Runnable{
	Button but;
	int i=0;
	Thread t;
	
	public void run(){
		for(int i=0; i<10;i++){
			repaint();
			System.out.println(Thread.currentThread().getName() + " " + i);
			try{
				Thread.sleep(500);
			} catch (Exception e){
				System.out.println(e);
			}
		}
	}
	public static void main(String args[]){
		Thread t = new Thread(new myClass());
		t.start();
	}

	public void paint(Graphics g){
		g.drawOval(i,i,50,50);

	}
}