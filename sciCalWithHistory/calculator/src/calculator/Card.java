package calculator;

import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.JPanel;

public class Card extends JPanel {
	
	public Card()
	{
		 CardLayout cd=new CardLayout();
		this.setLayout(cd);
		this.setPreferredSize(new Dimension(400,300));
		
		Button b=new Button();
		SciPanel s=new SciPanel();
		
		this.add(b,"Normal");
		this.add(s,"Science");
	
		//cd.show(this,"Normal");
		
		
	}
	
}