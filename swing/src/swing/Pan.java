package swing;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pan extends JPanel implements ItemListener 
{
	public static StringBuffer choices;

	private JCheckBox box1;
	private JCheckBox box2;
	private JCheckBox box3;
	public JLabel lab;
	
	Pan()
	{
		box1=new JCheckBox("Lion");
		box1.setBorder(BorderFactory.createEmptyBorder(10,0,10,0));
		box2=new JCheckBox("Deer");
		box1.setBorder(BorderFactory.createEmptyBorder(10,0,10,0));
		box3=new JCheckBox("Panther");
		box1.setBorder(BorderFactory.createEmptyBorder(10,0,10,0));
		lab=new JLabel();
		lab.setAlignmentY(0.5f);
		lab.setAlignmentX(0.5f);
		
		
		ImagePane.panelForImg.add(lab);
		
		box1.addItemListener(this);
		box2.addItemListener(this);
		box3.addItemListener(this);
		
		this.setLayout(new GridLayout(0,1));
		
		
		this.add(box1);
		this.add(box2);
		this.add(box3);
		
		choices=new StringBuffer("---");
		
	}
	public void itemStateChanged(ItemEvent e)
	{
	   char c='*';
	   int index=0;
	   
	   Object source=e.getSource();
		if(source.equals(box1))
		{
           index=0;
           c='l';
		}
		else if(source.equals(box2))
		{
			index=1;
			c='d';
			
		}
		else if(source.equals(box3))
		{
			index=2;
			c='p';
		}
		
		if(e.getStateChange().equalsItemEvent.DESELECTED)
		{
			c='-';
		}
		
		choices.setCharAt(index, c);
		
		if(!(choices.toString().equals("---")))
		{
		java.net.URL path=getClass().getResource("/images/"+choices.toString()+".png");
		ImageIcon img=new ImageIcon(path);
		 
		lab.setIcon(img);
		}// end of if
		else
		{
			ImageIcon img=null;
			lab.setIcon(img);
		}
	}
	
}