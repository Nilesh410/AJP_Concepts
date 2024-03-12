package SWING;

import javax.swing.*;

public class Insem1 {

		JFrame f;
		JCheckBox cb1,cb2;
		Insem1()
		{
			f=new JFrame("Notepad");
			f.setVisible(true);
			f.setLayout(null);
			f.setSize(400,400);
			init();
			add_component();
		}
		public void init()
		{
			cb1=new JCheckBox("C++",false);
			cb1.setBounds(100,20,50,50);
			cb2=new JCheckBox("Java",true);
			cb2.setBounds(100,70,100,50);
		}
		public void add_component()
		{
			f.add(cb1);
			f.add(cb2);
			
		}
		public static void main(String[] args) 
		{
			new Insem1();
		}
	}


