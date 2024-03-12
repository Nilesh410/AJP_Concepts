package Component_Example;

import javax.swing.*;

public class JTable_Example {
    
	JFrame f;
    JTable tb;
    JScrollPane sp;
    JTable_Example()
    {
    	f=new JFrame();
    	f.setVisible(true);
    	f.setSize(100,200);
    	
    	f.setTitle("JTable Example");
    	init();
    	add_component();	
    }
    public void init()
    {
    	String data[][]={ {"21101","Amit","CS"},    
                {"41102","Jai","IT"},    
                {"23101","Sachin","ETC"}};    
        String column[]={"ID","NAME","Dept"};       
    	tb=new JTable(data,column);
    	 tb.setBounds(100,100,200,300);          
    	    
    }
    public void add_component()
    {
    	sp=new JScrollPane(tb); 
    	f.add(sp);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new JTable_Example();
	}

}
