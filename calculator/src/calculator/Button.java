package calculator;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Button extends JPanel implements ActionListener{
	
	
	
	
	public JButton add;
	public JButton subtract;
	public JButton multiply;
	public JButton divide;
	public JButton squareRoot;
	public JButton clear;
	public JButton equals;
	public JButton dot;
	public JButton perc;
	
	
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
	public JButton change;
	
	Double no1,no2;
	Double res=0.0;
	String op="";

	
	public Button() {
		
		add=new JButton("+");
		subtract=new JButton("-");
		multiply=new JButton("X");
		divide=new JButton("/");
		squareRoot=new JButton("Root");
		clear=new JButton("clr");
		equals=new JButton("=");
		perc=new JButton("%");
		
		
		dot=new JButton(".");
		zero=new JButton("0");
		one=new JButton("1");
		two=new JButton("2");
		three=new JButton("3");
		four=new JButton("4");
		five=new JButton("5");
		six=new JButton("6");
		seven=new JButton("7");
		eight=new JButton("8");
		nine=new JButton("9");
		change=new JButton("change");

		
		//registering action listener for functional buttons
		add.addActionListener(this);
		subtract.addActionListener(this);	
		multiply.addActionListener(this);
		divide.addActionListener(this);
		squareRoot.addActionListener(this);
		clear.addActionListener(this);
		equals.addActionListener(this);
		change.addActionListener(this);
		perc.addActionListener(this);
		
		
		//registering action listener for non-functional buttons
		dot.addActionListener(this);
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
		
		//setting font manager for this panel
		//also setting its size
		this.setLayout(new GridLayout(0, 4));
		this.setPreferredSize(new Dimension(150, 200));
		
		
		// Adding functional buttons to this panel
		this.add(add);
		this.add(subtract);
		this.add(multiply);
		this.add(divide);
		this.add(squareRoot);
		this.add(perc);
		this.add(clear);
		this.add(equals);
		
		
		//Adding non functional buttons to this panel
		this.add(dot);
		this.add(zero);
		this.add(one);
		this.add(two);
		this.add(three);
		this.add(four);
		this.add(five);
		this.add(six);
		this.add(seven);
		this.add(eight);
		this.add(nine);
		this.add(change);
	//	this.revalidate();
	}
	public void actionPerformed(ActionEvent e)
	{
		
		
		
		
		
		
		 if(e.getSource().equals(add))
		{
			no1=Double.parseDouble(ShowPanel.l1.getText());
		    op= "+";
		    ShowPanel.l1.setText("");
		    res=res+no1;
		    no1=res;
		}
		
		else if(e.getSource().equals(subtract))
		{
			//for negation
			if(ShowPanel.l1.getText()=="")
				ShowPanel.l1.setText("-");
			
			//for operation
			else
			{	
			    no1=Double.parseDouble(ShowPanel.l1.getText());
		        op= "-";
		        ShowPanel.l1.setText("");
		    
		        //if result is not zero, then only repetitive subt.
		        if(res!=0)
		       {   
		    	   res=res-no1;
			       no1=res;
		       }
		       else
			       res=no1;
		    
		   }
		}
		
		else if(e.getSource().equals(multiply))
		{
			no1=Double.parseDouble(ShowPanel.l1.getText());
		    op= "*";
		    ShowPanel.l1.setText("");
		    
		    //if result is not zero,then only repetitive multi.
		    if(res!=0)
		    { 	
		    res=res*no1;
		    no1=res;
		    }
		    else
		    	res=no1;
			
		}
		
		else if(e.getSource().equals(divide))
		{
			no1=Double.parseDouble(ShowPanel.l1.getText());
			
		    op= "/";
		    ShowPanel.l1.setText("");
		    
		    //same for repetitive division
		    if(res!=0)
		    {
		    	res=res/no1;
			    no1=res;
		    }
		    else
		    	res=no1;
		}
		
		else if(e.getSource().equals(squareRoot))
		{
			no1=Double.parseDouble(ShowPanel.l1.getText());
		    Double ans= Math.sqrt(no1); 
		    ShowPanel.l1.setText(Double.toString(ans));
		}
		 
		else if(e.getSource().equals(perc))
		{
			no1=Double.parseDouble(ShowPanel.l1.getText());
			no1=no1/100;
			ShowPanel.l1.setText(String.valueOf(no1));
		}
		
		
		else if(e.getSource().equals(dot))
		{
			if(!(ShowPanel.l1.getText().indexOf('.')>=0))
			ShowPanel.l1.setText(ShowPanel.l1.getText()+".");
			
		}
		
		
		else if(e.getSource().equals(zero))
		{
			ShowPanel.l1.setText(ShowPanel.l1.getText()+String.valueOf(0));
			
		}
		
		
		else if(e.getSource().equals(one))
		{
			ShowPanel.l1.setText(ShowPanel.l1.getText()+String.valueOf(1));
			
		}
		
		else if(e.getSource().equals(two))
		{
			ShowPanel.l1.setText(ShowPanel.l1.getText()+String.valueOf(2));
			
		}
		
		else if(e.getSource().equals(three))
		{
			ShowPanel.l1.setText(ShowPanel.l1.getText()+String.valueOf(3));
			
		}
		
		else if(e.getSource().equals(four))
		{
			
			ShowPanel.l1.setText(ShowPanel.l1.getText()+String.valueOf(4));
		}
		
		else if(e.getSource().equals(five))
		{
			ShowPanel.l1.setText(ShowPanel.l1.getText()+String.valueOf(5));
			
		}
		
		else if(e.getSource().equals(six))
		{
			ShowPanel.l1.setText(ShowPanel.l1.getText()+String.valueOf(6));
			
		}
		
		else if(e.getSource().equals(seven))
		{
			ShowPanel.l1.setText(ShowPanel.l1.getText()+String.valueOf(7));
			
		}
		
		else if(e.getSource().equals(eight))
		{
			ShowPanel.l1.setText(ShowPanel.l1.getText()+String.valueOf(8));
			
		}
		
		else if(e.getSource().equals(nine))
		{
			ShowPanel.l1.setText(ShowPanel.l1.getText()+String.valueOf(9));
			
		}
		
		else if(e.getSource().equals(clear))
		{
			ShowPanel.l1.setText("");
			res=0.0;
		}
		 
		else if(e.getSource().equals(change))
		{
			
		
			CalcPanel.changePanel();
			
			
			//Card.cd.next(new Card());
			//Did this and nothing happened on -click
			//I assume that cd takes a new Card panel and thus nothing happens because 
			//this new panel has not been instilled anywhere
			//And so i called CalcPanel module where it is installed
			
		}
		
		else if(e.getSource().equals(equals))
		{
			
			no2=Double.parseDouble(ShowPanel.l1.getText());
		
		    switch(op)
		    {
		         case "+": res=res+no2;
		                   break;
		                   
		         case "-": res=no1-no2;
                           break;
                 
		         case "*": res=no1*no2;
                           break;
                 
		         case "/": res=no1/no2;
                           break;
                                    
		    }
		    ShowPanel.l1.setText(Double.toString(res));
		    res=0.0;
		}
	}
}


