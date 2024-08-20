package calculator;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class CalcPanel extends JPanel {
	
	public CalcPanel() {
		this.setLayout(new BorderLayout());
		
		//Adding Display Panel which shows results
		ShowPanel show=new ShowPanel();
		this.add(show,BorderLayout.PAGE_START);
		
		
		//Adding Button Panel which holds buttons
		Button bp=new Button();
		this.add(bp);
		
	// this.add(bp,BorderLayout.PAGE_END) 
	// gave overlapping issue;the two components were displaced over each other
	//	this.revalidate();
	}

}
