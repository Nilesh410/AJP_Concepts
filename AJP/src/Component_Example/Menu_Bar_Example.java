package Component_Example;
import java.awt.*;
import java.awt.event.*;
public class Menu_Bar_Example extends WindowAdapter implements ActionListener
{
    Frame f;
    MenuBar mb;
    Menu file, edit;
    MenuItem item1,item2,item3,item4,item5,item6,item7,item8;
    Label l;
    Menu_Bar_Example()
    {
    	f=new Frame();
    	f.setSize(500,500);
    	f.setLayout(null);
    	f.setVisible(true);
    	f.setTitle("Menu_Bar_Example");
    	init();
    	add_component();
    }
    public void init()
    {
    	mb=new MenuBar();
    	file=new Menu("File");
    	edit=new Menu("Edit");
    	item1=new MenuItem("Save");
    	item5=new MenuItem("New File");
    	item6=new MenuItem("Open");
    	item7=new MenuItem("Save As");
    	
    	item8=new MenuItem("Cut");
    	item2=new MenuItem("Copy");
    	item3=new MenuItem("-");
    	item4=new MenuItem("Paste");
    	file.add(item5);
    	file.add(item6);
    	file.add(item1);
    	file.add(item7);
    	edit.add(item8);
    	edit.add(item2);
    	edit.add(item3);
    	edit.add(item4);
    	l=new Label();
    	l.setAlignment(Label.CENTER);
		l.setSize(400,400);
    }
    public void add_component()
    {
    	 mb.add(file);
    	 mb.add(edit);
         f.setMenuBar(mb);
         f.add(l);
         f.addWindowListener(this);
         item1.addActionListener(this);
         item2.addActionListener(this);
         item4.addActionListener(this);
         
    }
    public void windowClosing(WindowEvent e)
    {
    	f.dispose();
    }
    public void actionPerformed(ActionEvent e)
    {
    	String msg=e.getActionCommand();
    	l.setText("selected item="+msg);
//    	Dialog d=new Dialog(f,"New Message Dialog");
//    	d.setSize(300,200);
//    	d.setVisible(true);
//    	d.setTitle("Dialog_Window");
//    	d.add(l);
//    	d.addWindowListener(this);
    	
    }
	public static void main(String[] args) 
	{
		
        new Menu_Bar_Example();
	}
	

}
