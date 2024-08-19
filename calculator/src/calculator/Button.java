package calculator;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Button extends JPanel implements ActionListener{
	
	/**
	 * 
	 */
	
	public JButton add;
	public JButton subtract;
	public JButton multiply;
	public JButton divide;
	public JButton squareRoot;
	public JButton clear;
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

		
		add.addActionListener(this);
		subtract.addActionListener(this);	
		multiply.addActionListener(this);
		divide.addActionListener(this);
		squareRoot.addActionListener(this);
		clear.addActionListener(this);
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
		
		
		this.setLayout(new GridLayout(0, 2));
		
		this.setPreferredSize(new Dimension(300, 200));
		
		this.add(add);
		this.add(subtract);
		this.add(multiply);
		this.add(divide);
		this.add(squareRoot);
		this.add(clear);
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
		this.revalidate();
	}
	public void actionPerformed(ActionEvent e)
	{
		
		
		
		if(e.getSource().equals(add))
		{
			no1=Double.parseDouble(ShowPanel.l1.getText());
		    op= "+";
		    ShowPanel.l1.setText("");			
		}
		
		else if(e.getSource().equals(subtract))
		{
			no1=Double.parseDouble(ShowPanel.l1.getText());
		    op= "-";
		    ShowPanel.l1.setText("");
		    
		}
		
		else if(e.getSource().equals(multiply))
		{
			no1=Double.parseDouble(ShowPanel.l1.getText());
		    op= "*";
		    ShowPanel.l1.setText("");
			
		}
		
		else if(e.getSource().equals(divide))
		{
			no1=Double.parseDouble(ShowPanel.l1.getText());
		    op= "/";
		    ShowPanel.l1.setText("");
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
		
		else if(e.getSource().equals(clear))
		{
			ShowPanel.l1.setText("");
		}
		
		else if(e.getSource().equals(equals))
		{
			
			no2=Double.parseDouble(ShowPanel.l1.getText());
		
		    switch(op)
		    {
		         case "+": res=no1+no2;
		                   break;
		                   
		         case "-": res=no1-no2;
                           break;
                 
		         case "*": res=no1*no2;
                           break;
                 
		         case "/": res=no1/no2;
                           break;
		    }
		    ShowPanel.l1.setText(Double.toString(res));
		    no1=res;
		}
	}
}


