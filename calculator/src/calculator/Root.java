package calculator;

import javax.swing.JFrame;
import javax.swing.JWindow;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import java.awt.Container;
import java.util.*;

public class Root  {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO AJFrame frame=new JFrame();
				JFrame frame=new JFrame();
				CalcPanel cPanel=new CalcPanel();
				
			
				frame.add(cPanel);
				frame.pack();
				
				
				
				frame.setVisible(true);
				

				
				
				frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
				
			}
		});
		

	}

}
