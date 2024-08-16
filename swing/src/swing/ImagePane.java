package swing;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImagePane extends JPanel
{
    
    public static JPanel panelForImg;
     
     ImagePane()
     {
    	 panelForImg=new JPanel();
    	 panelForImg.setLayout((new BoxLayout(panelForImg,BoxLayout.PAGE_AXIS)));
    	 
    	 
    	 panelForImg.setBackground(new Color(178,102,205));//178,102,205
    	 panelForImg.setPreferredSize(new Dimension(750,450));
    	 this.add(panelForImg);
    	 
     }
	
} 

