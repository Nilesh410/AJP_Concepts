package Component_Example;
import javax.swing.*;
import java.awt.*;

public class JScrollPane_Example 
{
     JFrame f;
     JScrollPane jsp;
     JPanel jp;
     JScrollPane_Example()
     {
    	 f=new JFrame();
    	 f.setVisible(true);
    	 f.setTitle("JScrollPane Example"); 
    	 f.setSize(300,250);
    	 init();
    	 add_component();
     }
     public void init()
     {
    	 
    	 jp=new JPanel();
    	 jp.setLayout(new GridLayout(20,20));
     }
     public void add_component()
     {
    	 int b=0;
    	 for(int i=0;i<20;i++)
    	 {
    		 for(int j=0;j<20;j++)
    		 {
    			 jp.add(new JButton("Button"+b));
    			 b++;
    		 }
    	 }
    	 jsp=new JScrollPane(jp);
    	 
    	 f.add(jsp,BorderLayout.CENTER);
     }
	public static void main(String[] args) 
	{
	      
         new JScrollPane_Example ();
	}

}
