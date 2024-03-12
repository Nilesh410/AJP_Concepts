package AWT;

import java.awt.*;
import java.awt.event.*;
public class Component_Example extends WindowAdapter implements ActionListener,ItemListener
{
    Frame f;
    Label l;
    TextField tf;
    Button b;
    Checkbox cb;
    CheckboxGroup cbg;
    Checkbox TE_V,TE_VI,TE_VII;
    Choice os;
    
    Component_Example()
    {
    	f=new Frame();
    	f.setVisible(true);
    	f.setLayout(null);
    	f.setTitle("Component_Example");
    	f.setSize(1000,1000);
    	init();
    	add_component();
    	register();
    }
    public void init()
    {
    	l=new Label("AWT");
    	l.setBounds(20,20,30,40);
    	
    	tf=new TextField(20);
    	tf.setBounds(20,80,150,50);
    	
    	b=new Button("click");
    	b.setBounds(20,150,100,50);
    	
    	cb=new Checkbox("Yes");
    	cb.setBounds(200,50,100,100);
    	
    	cbg=new CheckboxGroup();
    	TE_V=new Checkbox("TE_V",cbg,false);
    	TE_VI=new Checkbox("TE_VI",cbg,false);
    	TE_VII=new Checkbox("TE_VII",cbg,false);
    	
        TE_V.setBounds(200,150,100,100);
        TE_VI.setBounds(300,150,100,100);
        TE_VII.setBounds(400,150,100,100);
        
        os=new Choice();
        os.setBounds(500,150,300,300);
        
    }
    public void add_component()
    {
    	f.add(l);
    	f.add(tf);
    	f.add(b);
    	f.add(cb);
    	f.add(TE_V);
    	f.add(TE_VI);
    	f.add(TE_VII);
    	os.add("windows");
    	os.add("Linux");
    	os.add("macos");
    	f.add(os);
    }
    public void register()
    {
    	f.addWindowListener(this);
    	b.addActionListener(this);
    	cb.addItemListener(this);
    	TE_V.addItemListener(this);
    	TE_VI.addItemListener(this);
    	TE_VII.addItemListener(this);
    	os.addItemListener(this);
    }
    public void windowClosing(WindowEvent e)
    {
    	f.dispose();
    }
    public void actionPerformed(ActionEvent e)
    {
    	tf.setText("AWT");
    }
    public void itemStateChanged(ItemEvent e)
    {
    	if(e.getSource()==cb)
    	{
    		boolean status=cb.getState();
        	if(status==true)
        		tf.setText("checkbox checked");
        	else
        		tf.setText("chechbox unchecked");
    	}
    	else if(e.getSource()==os)
    	{
    		tf.setText(os.getSelectedItem());
    		/*Integer index=os.getSelectedIndex();
    		tf.setText(index.toString());*/
    	}
    	else
    	{
    		tf.setText(cbg.getSelectedCheckbox().getLabel());
    		//tf.setText(e.getSource().toString());
    	}
    	
    }
    
	public static void main(String[] args) 
	{
		new Component_Example();

	}

}
