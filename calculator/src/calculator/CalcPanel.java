package calculator;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class CalcPanel extends JPanel {
	
	public CalcPanel() {
		this.setLayout(new BorderLayout());
		
		
		ShowPanel show=new ShowPanel();
		this.add(show,BorderLayout.PAGE_START);
		
		
		
		Button bp=new Button();
		this.add(bp);
		
		this.revalidate();
	}

}
