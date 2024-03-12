package Component_Example;
import java.awt.event.*;
import java.awt.*;

public class ScrollBar_Example extends WindowAdapter implements AdjustmentListener
{
    Frame f;
    Scrollbar vertsb,horzsb;
    Label l;
	ScrollBar_Example()
	{
		f=new Frame();
		f.setVisible(true);
		f.setSize(500,500);
		f.setLayout(null);
		f.setTitle("ScrollBar");
//		f.setBackground(Color.GRAY);
		init();
		add_component();
	}
	public void init()
	{
		vertsb=new Scrollbar(Scrollbar.VERTICAL,0,1,0,10);
		horzsb=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,10);
		l=new Label();
	}
	public void add_component()
	{
		f.add(vertsb);
		vertsb.setBounds(30,50,20,100);
		f.add(horzsb);
		horzsb.setBounds(100,100,100,20);
		l.setAlignment(Label.CENTER);
		l.setSize(400,100);
		f.add(l);
		f.addWindowListener(this);
		vertsb.addAdjustmentListener(this);
		horzsb.addAdjustmentListener(this);
	}
	public void windowClosing(WindowEvent e)
	{
		f.dispose();
	}
	public void adjustmentValueChanged(AdjustmentEvent e)
	{
		if(e.getSource()==vertsb)
		{
		    l.setText("vertical scroll bar value is="+vertsb.getValue());
		     int adjustment_type=e.getAdjustmentType();
		     System.out.println("adjustment_type="+adjustment_type);
		}
		else
		{
			l.setText("horizontal scroll bar value is="+horzsb.getValue());
		   int adjustment_type=e.getAdjustmentType();
			 System.out.println("adjustment_type="+adjustment_type);
		}
	}
	public static void main(String[] args) 
	{
	   new ScrollBar_Example();

	}

}
