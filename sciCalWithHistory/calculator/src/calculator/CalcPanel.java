package calculator;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;

public class CalcPanel extends JPanel {
	
	public static Card cardpanel;
	
	public CalcPanel() {
		this.setLayout(new BorderLayout());
		this.setPreferredSize(new Dimension(400,400));
		
		//Adding Display Panel which shows results
		ShowPanel show=new ShowPanel();
		this.add(show,BorderLayout.NORTH);
		
		
		cardpanel=new Card();
		this.add(cardpanel);
		//this.setVisible(true);
		
		
		//Adding Button Panel which holds buttons
		//Button bp=new Button();
		//this.add(bp);
		
	   // this.add(bp,BorderLayout.PAGE_END) 
	   // gave overlapping issue;the two components were displaced over each other
	   //	this.revalidate();
	}

	public static void changePanel()
	{
		CardLayout cl=(CardLayout)cardpanel.getLayout();
		cl.next(cardpanel);
		
	}
}
