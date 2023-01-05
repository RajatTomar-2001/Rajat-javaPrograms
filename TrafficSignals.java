package java_programs;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class TrafficSignals extends Applet implements Runnable {
	Thread t;
	String s="";
	int c;
	Font f;
	public void init()
	{
		s=new String();
		s="stop";
		c=1;
		f= new Font("Arial",Font.BOLD,50);
		t= new Thread(this);
	}
	public void start()
	{
		t.start();
	}
	
	public void run()

	{
		for(int i=1;i<=100;i++)
		{
			try
			{
				if(c==1)
				{
					repaint();
					Thread.sleep(5000);
					c=2;
				}
				else if(c==2)
				{
					repaint();
					Thread.sleep(2000);
					c=3;
				}
				else if(c==3)
				{
					repaint();
					Thread.sleep(4000);
					c=1;
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.gray);
		g.fillRect(100,80,55,200);
		
		g.setColor(Color.black);
		g.drawOval(100, 100,50,50);
		
		g.setColor(Color.black);
		g.drawOval(100, 150,50,50);
		
		g.setColor(Color.black);
		g.drawOval(100, 200,50,50);
		
		if(c==1)
		{
			g.setColor(Color.red);
			g.fillOval(100, 100,50,50);
			
		}
		else if(c==2)
		{
			g.setColor(Color.yellow);
			g.fillOval(100, 150,50,50);
		}
		else if(c==3)
		{
			g.setColor(Color.green);
			g.fillOval(100, 200,50,50);
		}
	}
}
