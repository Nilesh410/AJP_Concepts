package Component_Example;

import javax.swing.*;
public class JTabbedPane_Example {
	JFrame f;
	JTabbedPane tp;
	
	JTabbedPane_Example()
	{
		f=new JFrame();
		f.setVisible(true);
		f.setTitle("JTabbedPane_E&TC");
		f.setSize(300,300);
		init();
		add_component();
	}
    public void init()
    {
    	tp=new JTabbedPane();
    	tp.addTab("SE", new SE());
    	tp.addTab("TE", new TE());
    	tp.addTab("BE", new BE());	
    }
    public void add_component()
    {
        f.add(tp);
    }
	public static void main(String[] args) 
	{
		new JTabbedPane_Example();

	}
}

class SE extends JPanel
{
	SE()
	{
		JButton b1=new JButton("S&S");
		add(b1);
	}
}
class TE extends JPanel
{
	TE()
	{
		JCheckBox cb1=new JCheckBox("FJP");
		add(cb1);
	}
}
class BE extends JPanel
{
	BE()
	{
		JComboBox jcb=new JComboBox();
		jcb.addItem("JAVAScript");
		add(jcb);
	}
}
