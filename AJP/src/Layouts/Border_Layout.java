package Layouts;
import java.awt.*;
import java.awt.event.*;

public class Border_Layout extends WindowAdapter{

	Frame f;
	Panel east,west,south,north,center;
	Button b;
	
	Border_Layout()
	{
		f=new Frame();
    	f.setVisible(true);
    	f.setLayout(new BorderLayout(30,30));
    	f.setTitle("BorderLayoutExample");
    	f.setSize(500,500);
    	init();
    	add_component();
    	
	}
	public void init()
    {
    	east=new Panel();
    	west=new Panel();
    	north=new Panel();
    	south=new Panel();
    	center=new Panel();
    	b=new Button("Button");
    	
    }
    public void add_component()
    {
    	east.setBackground(Color.GREEN);
    	west.setBackground(Color.BLUE);
    	north.setBackground(Color.RED);
    	south.setBackground(Color.BLACK);
    	center.setBackground(Color.WHITE);
    	center.add(b);
    	f.add(east,BorderLayout.EAST);
    	f.add(west,BorderLayout.WEST);
    	f.add(north,BorderLayout.NORTH);
    	f.add(south,BorderLayout.SOUTH);
    	f.add(center,BorderLayout.CENTER);
    	
    	f.addWindowListener(this);
    }
    
    public void windowClosing(WindowEvent e)
    {
    	f.dispose();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      new Border_Layout();
	}

}
