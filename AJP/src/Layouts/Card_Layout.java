package Layouts;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class Card_Layout implements ActionListener
{
    JFrame f;
	CardLayout crd;
	Container c;
	JButton b1,b2,b3;
	
	Card_Layout()
	{
		f=new JFrame();
		f.setVisible(true);
		f.setTitle("CardLayout");
		f.setSize(200,200);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 
		c=f.getContentPane();
		crd=new CardLayout();
		c.setLayout(crd);
		init();
		add_component();
		
	}
	public void init()
	{
		b1=new JButton("First");
		b2=new JButton("Second");
		b3=new JButton("Third");
	}
	public void add_component()
	{
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		c.add("a",b1);
		c.add("b",b2);
		c.add("c",b3);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		crd.next(c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new Card_Layout();
	}

}
