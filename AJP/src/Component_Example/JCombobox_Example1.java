package Component_Example;
import javax.swing.*;
import java.awt.event.*;
public class JCombobox_Example1 implements ActionListener{
	
    JFrame f;
    JComboBox cb;
    JLabel l;
    JButton b;
    JCombobox_Example1()
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
    	/*String Dept[]= {"CS","ETC","IT"};
    	cb=new JComboBox(Dept);*/
    	cb=new JComboBox();
    	l=new JLabel();
    	l.setHorizontalAlignment(JLabel.CENTER);  
    	l.setSize(400,100);  
    	b=new JButton("Show");  
    	b.setBounds(200,100,75,20);  
    	
    }
    public void add_component()
    {
    	cb.addItem("CS");
    	cb.addItem("ETC");
    	cb.addItem("IT");
    	f.add(cb);
    	cb.setBounds(50,100,90,20);
    	f.add(l);
    	f.add(b);
    	b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
    	String data="Dept Selected="+cb.getItemAt(cb.getSelectedIndex());
    	l.setText(data);
    }
	public static void main(String[] args) 
	{
		
       new JCombobox_Example1();
	}

}

