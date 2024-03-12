package Component_Example;
import java.awt.*;
import java.awt.event.*;
public class Canvas_Example extends WindowAdapter
{   Frame f;
    Canvas c;
    Canvas_Example()
    {
    	f=new Frame();
    	f.setSize(500,500);
    	f.setVisible(true);
    	f.setTitle("Canvas_Example");
    	f.setLayout(null);
    	init();
    	add_component();
    
    }
    public void init()
    {
    	c=new Canvas() {
    		 public void paint(Graphics g)
             {
                 // set color to red
                 g.setColor(Color.red);
  
                 // set Font
                 g.setFont(new Font("Bold", 1, 20));
  
                 // draw a string
                 g.drawString("This is a canvas", 100, 100);
             }
    	};
    	c.setBackground(Color.GRAY);
    	c.setSize(300,300);
    	
    }
   
    public void add_component()
    {
    	f.add(c);
    	f.addWindowListener(this);
    }
    public void windowClosing(WindowEvent e)
    {
    	f.dispose();
    }
    

	public static void main(String[] args) 
	{
		new Canvas_Example();      
	}

}
