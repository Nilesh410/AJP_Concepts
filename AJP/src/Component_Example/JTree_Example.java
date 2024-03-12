package Component_Example;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;
import java.awt.*;

public class JTree_Example {
	JTree tr;
	JFrame f;
	JLabel l;
	JTree_Example()
	{
		f=new JFrame();
		f.setVisible(true);
		f.setTitle("JTree_Example");
		f.setSize(300,300);
		init();
		add_component();
		event_handling();
	}
	public void init()
	{
		//Creating root node
		DefaultMutableTreeNode root =new DefaultMutableTreeNode("PICT");
		
		//Creating set of child nodes
		DefaultMutableTreeNode parent1 =new DefaultMutableTreeNode("CS");
		DefaultMutableTreeNode child1_1 =new DefaultMutableTreeNode("SE_CS");
		DefaultMutableTreeNode child1_2 =new DefaultMutableTreeNode("TE_CS");
		DefaultMutableTreeNode child1_3 =new DefaultMutableTreeNode("BE_CS");
		//Adding child nodes to parent 1
		parent1.add(child1_1);
		parent1.add(child1_2);
		parent1.add(child1_3);	
		
		//Creating another set of child nodes
		DefaultMutableTreeNode parent2 =new DefaultMutableTreeNode("ETC");
		DefaultMutableTreeNode child2_1 =new DefaultMutableTreeNode("SE_ETC");
		DefaultMutableTreeNode child2_2 =new DefaultMutableTreeNode("TE_ETC");
		DefaultMutableTreeNode child2_2_1 =new DefaultMutableTreeNode("TE_ETC_V");
		child2_2.add(child2_2_1);
		DefaultMutableTreeNode child2_3 =new DefaultMutableTreeNode("BE_ETC");
		parent2.add(child2_1);
		parent2.add(child2_2);
		parent2.add(child2_3);	
		
		//Creating another set of child nodes
		DefaultMutableTreeNode parent3 =new DefaultMutableTreeNode("IT");
		DefaultMutableTreeNode child3_1 =new DefaultMutableTreeNode("SE_IT");
		DefaultMutableTreeNode child3_2 =new DefaultMutableTreeNode("TE_IT");
		DefaultMutableTreeNode child3_3 =new DefaultMutableTreeNode("BE_IT");
		parent3.add(child3_1);
		parent3.add(child3_2);
		parent3.add(child3_3);	
		
		//Adding parent nodes to the root
		root.add(parent1);
		root.add(parent2);
		root.add(parent3);
		
		//Creating Tree
		tr=new JTree(root);
		l=new JLabel();
		
		
		
	}
	public void add_component()
	{
		f.add(new JScrollPane(tr));
		f.add(l,BorderLayout.SOUTH);
		
	}
	public void event_handling()
	{
		tr.addTreeSelectionListener(new TreeSelectionListener() {
			public void valueChanged(TreeSelectionEvent e)
			{
				l.setText("selection node:"+e.getPath());
			}
		});
	}
	
	public static void main(String[] args) {
         new JTree_Example();
	}

}
