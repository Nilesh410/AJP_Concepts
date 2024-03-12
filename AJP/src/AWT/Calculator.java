package AWT;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends WindowAdapter implements ActionListener
{
	Frame f;
	TextField t1,t2,t3;
	Label l1,l2,l3;
	Button b1,b2,b3,b4,b5;
	Font font;
    Calculator()
    {
    	f=new Frame();
    	f.setSize(500,300);
    	f.setVisible(true);
    	f.setLayout(null);
    	f.setTitle("Calculator");
    	f.setBackground(Color.CYAN);
    	init();
    	add_component();
    	register();
    }
    public void init()
    {
    	font=new Font("Arial",Font.BOLD,15);
    	l1=new Label("Input 1");
    	l2=new Label("Input 2");
    	l3=new Label("Result");
    	t1=new TextField(20);
    	t2=new TextField(20);
    	t3=new TextField(20);
    	b1=new Button("+");
    	b2=new Button("-");
    	b3=new Button("*");
    	b4=new Button("/");
    	b5=new Button("Reset");
    	
    	
    }
    public void add_component()
    {
    	l1.setBounds(30,40,50,50);
    	l1.setFont(font);
    	f.add(l1);
    	l2.setBounds(30,80,50,50);
    	l2.setFont(font);
    	f.add(l2);
    	l3.setBounds(250,40,50,50);
    	l3.setFont(font);
    	f.add(l3);
    	t1.setBounds(100,40,100,40);
    	f.add(t1);
    	t2.setBounds(100,90,100,40);
    	f.add(t2);
    	t3.setBounds(320,40,100,40);
    	f.add(t3);
    	b1.setBounds(30,150,50,50);
    	f.add(b1);
    	b2.setBounds(100,150,50,50);
    	f.add(b2);
    	b3.setBounds(170,150,50,50);
    	f.add(b3);
    	b4.setBounds(240,150,50,50);
    	f.add(b4);
    	b5.setBounds(310,150,100,50);
    	f.add(b5);
    	f.addWindowListener(this);	
    }
    public void register()
    {
    	b1.addActionListener(this);
    	b2.addActionListener(this);
    	b3.addActionListener(this);
    	b4.addActionListener(this);
    	b5.addActionListener(this);
    }
    public void windowClosing(WindowEvent e)
    {
    	f.dispose();
    }
    public void actionPerformed(ActionEvent e)
    {
    	String text1=t1.getText();
    	String text2=t2.getText();
    	
    	Integer num1=Integer.parseInt(text1);
    	Integer num2=Integer.parseInt(text2);
    	Integer answer=0;
    	Object b=e.getSource();
    	
    	if(b==b1)
    	   answer=num1+num2;
    	else if(b==b2)
    	   answer=num1-num2;
    	else if(b==b3)
    		answer=num1*num2;
    	else if(b==b4)
    		answer=num1/num2;
    	else
    	{
             t1.setText("");
             t2.setText("");
    	}
    	t3.setText(answer.toString());
    	
    }
	
	public static void main(String[] args) 
	{
		new Calculator();

	}

}
