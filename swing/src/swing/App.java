
/*  Hierarchy here:
 *         JWindow
 *               Root pane
 *                       JPanel
 *                    Pan       ImagePane
 *                                 
 *   Description:
 *           ImagePane is a JPanel child class and its the purple colour Rect. in App.                              
 *           Pan contains Checkboxes JPanel.                            
 *                        
 * */


package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.image.BufferedImage;


import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
public class App {

	public static void main(String[] args)
	{
		/*
		 * JFrame j=new JFrame(); j.setVisible(true);
		 * 
		 * BufferedImage img=null;
		 * 
		 * try { img = ImageIO.read(new File("image/i1.jpg")); } catch (IOException e) {
		 * } ImageIcon i=new ImageIcon(img);
		 * 
		 * JLabel l=new JLabel(i);
		 * 
		 * 
		 * j.getContentPane().add(l);
		 */
		 JFrame j=new JFrame();
		 
		
	     File f=new File("i1.jpg");
	     
	     ImageIcon i=new ImageIcon(f.getPath());
	     
	     j.setIconImage(i.getImage());       
	     
	     ImagePane p2=new ImagePane();
	     Pan p=new Pan();
	   
	     
	    // p.setPreferredSize(new Dimension(100,100));
	     
	     JPanel pane=new JPanel(new BorderLayout());
	     
	     
	     pane.add(p,BorderLayout.LINE_START);
	     pane.add(p2,BorderLayout.CENTER);
	     
	     pane.revalidate();
	     j.add(pane);
         j.pack();
         
        
         j.setSize(500, 250);  
         j.setResizable(true);
	    j.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	    j.setVisible(true);
	     
	}

}
