package Component_Example;
import javax.swing.*;
import java.awt.event.*;
public class JCombobox_Example {
	
    JFrame f;
    JComboBox cb;
   
    JCombobox_Example()
    {
    	f=new JFrame();
    	f.setVisible(true);
    	f.setSize(400,500);
    	f.setLayout(null);
    	f.setTitle("JComboBox Example");
    	init();
    	add_component();	
    }
    public void init()
    {
//    	String Dept[]= {"CS","ETC","IT"};
//    	cb=new JComboBox(Dept);
    	cb=new JComboBox();
    	
    }
    public void add_component()
    {
    	cb.addItem("CS");
    	cb.addItem("ETC");
    	cb.addItem("IT");
    	f.add(cb);
    	cb.setBounds(50,50,90,20);
    }
	public static void main(String[] args) 
	{
		
       new JCombobox_Example();
	}

}
