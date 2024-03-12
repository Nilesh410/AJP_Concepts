package Layouts;
import java.awt.*;
import java.awt.event.*;
public class Grid_Layout extends WindowAdapter
{
	Frame f;
	int n=4;
	Grid_Layout()
	{
		f=new Frame();
		
		f.setVisible(true);
		f.setTitle("Grid_Layout");
		f.setLayout(new GridLayout(n,n));
		f.setSize(new Dimension(500,500));
		f.addWindowListener(this);
		f.setFont(new Font("Vardana",Font.BOLD,24));
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				int k=i*n+j;
				if(k>0)
					f.add(new Button(""+k));
			}
		}
	}
	public void windowClosing(WindowEvent e)
	{
		f.dispose();
	}

	public static void main(String[] args)
	{
		new Grid_Layout();

	}

}
