package calculator;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;


public class ButtonPanel extends JPanel implements ActionListener{
	
	/**
	 * 
	 */
	
	public JButton add;
	public JButton subtract;
	public JButton multiply;
	public JButton divide;
	public JButton squareRoot;
	public JButton equals;
	public JButton zero;
	public JButton one;
	public JButton two;
	public JButton three;
	public JButton four;
	public JButton five;
	public JButton six;
	public JButton seven;
	public JButton eight;
	public JButton nine;
	
	public String ch[];
	Queue<String> queue;
	
	public ButtonPanel() {
		
		add=new JButton("+");
		subtract=new JButton("-");
		multiply=new JButton("X");
		divide=new JButton("/");
		squareRoot=new JButton("Root");
		equals=new JButton("=");
		zero=new JButton("0");
		one=new JButton("1");
		two=new JButton("2");
		three=new JButton("3");
		four=new JButton("4");
		five=new JButton("5");
		six=new JButton("6");
		seven=new JButton("7");
		eight=new JButton("8");
		nine=new JButton("0");
		ch=new String[30];
		queue=new LinkedList<String>();
		
		add.addActionListener(this);
		subtract.addActionListener(this);	
		multiply.addActionListener(this);
		divide.addActionListener(this);
		squareRoot.addActionListener(this);
		equals.addActionListener(this);
		zero.addActionListener(this);
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
		
		
		this.setLayout(new GridLayout(0, 3));
		
		this.setSize(new Dimension(250, 500));
		
		this.add(add);
		this.add(subtract);
		this.add(multiply);
		this.add(divide);
		this.add(squareRoot);
		this.add(equals);
		this.add(one);
		this.add(two);
		this.add(three);
		this.add(four);
		this.add(five);
		this.add(six);
		this.add(seven);
		this.add(eight);
		this.add(nine);
	}
	public void actionPerformed(ActionEvent e)
	{
		
		int flagEquals=0;
		
		if(e.getSource().equals(add))
		{
			queue.offer("+");
		
			
		}
		
		else if(e.getSource().equals(subtract))
		{
			queue.offer("-");
		    
		}
		
		else if(e.getSource().equals(multiply))
		{
			queue.offer("*");
			
		}
		
		else if(e.getSource().equals(divide))
		{
			queue.offer("/");
		
		}
		
		else if(e.getSource().equals(one))
		{
			queue.offer("1");
			
		}
		
		else if(e.getSource().equals(two))
		{
			queue.offer("2");
			
		}
		
		else if(e.getSource().equals(three))
		{
			queue.offer("3");
			
		}
		
		else if(e.getSource().equals(four))
		{
			queue.offer("4");
			
		}
		
		else if(e.getSource().equals(equals))
		{
			
			String no1="",op,no2="";
			Integer res=0;
			while(!queue.isEmpty())
			{	
			    while(true)
			    {
			         if(Pattern.matches("[+-*/^]", queue.element()))
			         {
			        	 op=queue.poll();
			    	     break;
			         }
			         
			         else 
			         {
					        no1=no1+queue.poll();
				     }
			    }
			   
			    while(true)
			    {
			    	no2+=queue.poll();   	
			        
			    }
			    
			    if(op.equals("+"))
				res=(Integer.parseInt(no1)+Integer.parseInt(no2));
			    
				if(op.equals("-"))
					res=Integer.parseInt(no1)-Integer.parseInt(no2);
				
			    if(op.equals("*"))
					res=(Integer.parseInt(no1)*Integer.parseInt(no2));
			    
				if(op.equals("/"))
					res=Integer.parseInt(no1)/Integer.parseInt(no2);
				
			}
			ShowPanel.l1.setText(res.toString());
			
		}
		if(flagEquals==0)
		{	
		     String totalCh="";
		     for(String s:queue)
		     {
			      totalCh=totalCh+s;
		     }
		     ShowPanel.l1.setText(totalCh);
		}
	}
}
