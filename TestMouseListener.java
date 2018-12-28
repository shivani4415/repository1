import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.*;
import java.applet.*;
//<Applet code="TestMouseListener.class"  height=400   width=400></Applet>
public class TestMouseListener extends Applet implements MouseListener,ActionListener {
	String s=" ";
	int mX=0,mY=0;
	Label l;
	Button b;
	Frame f;
	public void init()
	{
		//super(sname);
		f=new Frame("frame 1");
		f.setBackground(Color.YELLOW);
		f.setLayout(new FlowLayout());
		f.setSize(400,400);
		f.setVisible(true);
		
		Panel p=new Panel();
		l=new Label(s+mX+" "+mY);
		b=new Button("Quit");
		
		p.add(l);
		p.add(b);
		
		f.add(p);
		f.addMouseListener(this);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
		{
			System.exit(0);
		}
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.BLUE);  
        g.fillOval(5,5,30,30);  
		
	}
	public void mouseClicked(MouseEvent e)
	{
		Graphics g=getGraphics();  
        g.setColor(Color.BLUE);  
        g.fillOval(e.getX(),e.getY(),30,30);
        paint(getGraphics());
		s="Mouse Clicked At :";
		l.setText(s+mX+" "+mY);
	}
	public void mousePressed(MouseEvent e)
	{
		mX=e.getX();
		mY=e.getY();
		s="Mouse Pressed At :";
		l.setText(s+mX+" "+mY);
	}
	public void mouseEntered(MouseEvent e)
	{
		mX=e.getX();
		mY=e.getY();
		s="Mouse Entered At :";
		l.setText(s+mX+" "+mY);
	}
	public void mouseExited(MouseEvent e)
	{
		mX=e.getX();
		mY=e.getY();
		s="Mouse Exited At :";
		l.setText(s+mX+" "+mY);
	}
	public void mouseReleased(MouseEvent e)
	{
		mX=e.getX();
		mY=e.getY();
		s="Mouse Released At :";
		l.setText(s+mX+" "+mY);
	}
	public static void main(String[] args) {
		TestMouseListener t=new TestMouseListener();
		//at.setSize(400,400);
		//at.setVisible(true);
		//at.setBackground(Color.blue);
	}

}
