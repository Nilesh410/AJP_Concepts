package Layouts;

import java.awt.*;
import java.awt.event.*;
public class Flow_Layout extends WindowAdapter implements ItemListener
{
	Frame f;
    Label l;
    CheckboxGroup cbg;
    Checkbox TE_V,TE_VI,TE_VII;
    
    
    Flow_Layout()
    {
    	f=new Frame();
    	f.setVisible(true);
    	f.setLayout(new FlowLayout(FlowLayout.LEFT));
    	f.setTitle("FlowLayoutExample");
    	f.setSize(500,500);
    	init();
    	add_component();
    	register();
    }
    public void init()
    {
    	cbg=new CheckboxGroup();
    	TE_V=new Checkbox("TE_V",cbg,false);
    	TE_VI=new Checkbox("TE_VI",cbg,false);
    	TE_VII=new Checkbox("TE_VII",cbg,false);
    	l=new Label();
    }
    public void add_component()
    {
    	f.add(TE_V);
    	f.add(TE_VI);
    	f.add(TE_VII);
    	f.add(l);
    	f.addWindowListener(this);
    }
    public void register()
    {
    	TE_V.addItemListener(this);
    	TE_VI.addItemListener(this);
    	TE_VII.addItemListener(this);
    }
    public void windowClosing(WindowEvent e)
    {
    	f.dispose();
    }
    public void itemStateChanged(ItemEvent e)
    {
    	l.setText(cbg.getSelectedCheckbox().getLabel());
    }
	public static void main(String[] args) 
	{
		
        new Flow_Layout();
	}

}
