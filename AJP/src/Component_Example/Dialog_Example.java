package Component_Example;
import java.awt.*;
import java.awt.event.*;
public class Dialog_Example extends WindowAdapter{
	Frame f;
	
	Dialog_Example()
	{
		f=new Frame();
		f.setSize(500,500);
		f.setVisible(true);
		f.setTitle("File Dialog Demo");
		FileDialog fd=new FileDialog(f,"File_Dialog");
		fd.setVisible(true);
		add_component();
		
	}
	void add_component()
	{
		f.addWindowListener(this);
	}
	public void windowClosing(WindowEvent e)
	{
		f.dispose();
	}

	public static void main(String[] args) 
	{
	     new Dialog_Example();
         
	}

}
