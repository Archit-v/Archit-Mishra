package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.DefaultBoundedRangeModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

public class ShowPanel extends JPanel 
{
	public static JLabel l1;
	
	ShowPanel()
	{
		this.setBackground(new Color(0,0,0));
		this.setPreferredSize(new Dimension(300,200));
		this.setLayout(new FlowLayout(FlowLayout.TRAILING));
		this.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		
		l1=new JLabel("");
		l1.setForeground(new Color(0,255,0));
		//l1.setSize(new Dimension(300,150));
		
		this.add(l1);
		
		this.revalidate();
	}

}
