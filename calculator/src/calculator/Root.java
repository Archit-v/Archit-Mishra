package calculator;

import javax.swing.JFrame;
import javax.swing.JWindow;
import javax.swing.WindowConstants;


import java.util.*;

public class Root  {

	public static void main(String[] args) {
		JFrame frame=new JFrame();
		
		CalcPanel cPanel=new CalcPanel();
		
		frame.add(cPanel);
		
		
		frame.setVisible(true);
		
		frame.setSize(200, 250);
		
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

}
