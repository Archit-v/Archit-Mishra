package calculator;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class CalcPanel extends JPanel {
	
	public CalcPanel() {
		this.setLayout(new BorderLayout());
		
		
		ShowPanel show=new ShowPanel();
		this.add(show);
		
		ButtonPanel bp=new ButtonPanel();
		this.add(bp,BorderLayout.PAGE_END);
		
		
	}

}
