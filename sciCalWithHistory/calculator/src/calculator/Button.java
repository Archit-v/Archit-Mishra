package calculator;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	
	public static String infix="";

	
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
		
		 char last='a';
		 if(infix!="")
			 last=infix.charAt(infix.length()-1);
		
		
		 if(e.getSource().equals(add))
		{
		    if(infix!="" && last!='+' && last!='-' && last!='*' && last!='/' && last!='^' && last!='(' && last!='.') // error handling - to check you don't enter operator on empty display or alongside another operator
		    {	
			infix+="+";
			ShowPanel.l1.setText(infix);
		    }
		}
		
		else if(e.getSource().equals(subtract))
		{
			if(infix!="" && last!='+' && last!='-' && last!='*' && last!='/' && last!='^' &&  last!='(' && last!='.')
			{	
			infix+="-";
			ShowPanel.l1.setText(infix);
			}
		}
		
		else if(e.getSource().equals(multiply))
		{
			if(infix!="" && last!='+' && last!='-' && last!='*' && last!='/' && last!='^' && last!='(' && last!='.')
			{	
			infix+="*";
			ShowPanel.l1.setText(infix);
			}
		}
		
		else if(e.getSource().equals(divide))
		{
			if(infix!="" && last!='+' && last!='-' && last!='*' && last!='/' && last!='^' &&  last!='(' && last!='.')
			{	
			infix+="/";
			ShowPanel.l1.setText(infix);
			}
		}
		
		else if(e.getSource().equals(squareRoot))
		{
			try
			{
		       no1= Math.sqrt(Double.parseDouble(infix)); 
		       infix=Double.toString(no1);
		       ShowPanel.l1.setText(infix);
			}
			catch(NumberFormatException n)
			{
				ShowPanel.l1.setText(infix);
			}
		}
		 
		else if(e.getSource().equals(perc))
		{
			try
			{
		       no1=Double.parseDouble(infix)/100; 
		       infix=Double.toString(no1);
		       ShowPanel.l1.setText(infix);
			}
			catch(NumberFormatException n)
			{
				ShowPanel.l1.setText(infix);
			}
			
		}
		
		
		else if(e.getSource().equals(dot))
		{
			if(!(infix.indexOf('.')>=0))
			{	
			  infix+='.';
			  ShowPanel.l1.setText(infix);
			}
			
		}
		
		
		else if(e.getSource().equals(zero))
		{
			infix+="0";
			ShowPanel.l1.setText(infix);
			
		}
		
		
		else if(e.getSource().equals(one))
		{
			infix+="1";
			ShowPanel.l1.setText(infix);
			
		}
		
		else if(e.getSource().equals(two))
		{
			infix+="2";
			ShowPanel.l1.setText(infix);
			
		}
		
		else if(e.getSource().equals(three))
		{
			infix+="3";
			ShowPanel.l1.setText(infix);
			
		}
		
		else if(e.getSource().equals(four))
		{
			
			infix+="4";
			ShowPanel.l1.setText(infix);
		}
		
		else if(e.getSource().equals(five))
		{
			infix+="5";
			ShowPanel.l1.setText(infix);
			
		}
		
		else if(e.getSource().equals(six))
		{
			infix+="6";
			ShowPanel.l1.setText(infix);
			
		}
		
		else if(e.getSource().equals(seven))
		{
			infix+="7";
			ShowPanel.l1.setText(infix);
			
		}
		
		else if(e.getSource().equals(eight))
		{
			infix+="8";
			ShowPanel.l1.setText(infix);
			
		}
		
		else if(e.getSource().equals(nine))
		{
			infix+="9";
			ShowPanel.l1.setText(infix);
			
		}
		
		else if(e.getSource().equals(clear))
		{
			infix="";
			ShowPanel.l1.setText(infix);
		}
		 
		else if(e.getSource().equals(change))
		{
			
		
			CalcPanel.changePanel();
			
			
			//Card.cd.next(new Card());
			//Did this and nothing happened on -click
			//I assume that cd takes a new Card panel and thus nothing happens because 
			//this new panel has not been installed anywhere
			//And so i called CalcPanel module where it is installed
			
		}
		
		else if(e.getSource().equals(equals))
		{
			//performs infix to postfix and then again postfix to infix using stack & queues
			//post to infix is done like- put two operands from queue to stack and when an operator is encountered,pop them from stack and perform calc. accordingly.
			//Finally,put the result on stack and keep going-on until the queue is empty
			
			char a =infix.charAt(infix.length()-1);
			if(a=='+'|| a=='-'|| a=='*'|| a=='/')
				infix="0.0";
			
			Queue<String> q=toPostfixExp(infix); //infix to post
		    Stack<Double> st2=new Stack<Double>();
		    
		    //for sin,cos, etc we will treat it as normal operands so getting them out of queue
		    Pattern pt=Pattern.compile("(sin|cos|tan|cot|cosec|sec|log|logE|neg)");
		    
		    Boolean error=false; //for try catch
		    
		    while(!q.isEmpty()) //post to infix	
		    {
		    	String op=q.poll();
		    	while(op!="+" && op!="-" && op!="*" && op!="/" && op!="^")//loop to get operands
		    	{
		    		
		    		    Matcher match=pt.matcher(op);
		    		    if(match.find())
		    		    {
		    			      //sending sin(x),cos(x) etc to sciCalculation() so to get their real-values
		    			      double trigVal=SciPanel.sciCalculation(op);
		    			      //System.out.println("in = module of button "+ trigVal);
		    			      st2.push(trigVal);
		    		
		    		    }
		    		    else 
		    		    {
		    		         // System.out.println(op + "Error");
		    		    	try {
		    		             st2.push(Double.parseDouble(op));
		    		    	}
		    		    	catch(NumberFormatException err)
		    		    	{
		    		    		error=true;
		    		    	}
		    		  
		    		    }
		    		    if(!q.isEmpty())
		    			     op=q.poll();
		    		    else
		    			    break;
		    	}
		    	
		    	
		    	
		    	double operand2=0.0;
		    	double operand1=0.0;
		    	
		    
		    	
		    	if(!st2.isEmpty())//edge case for single function like sin(x)
		    		operand1=st2.pop();
		    	
		    	if(!st2.isEmpty())
		    		operand2=st2.pop();
		    	
		    	switch(op)
		    	{
		    	      case "+":res=operand2+operand1;
		    	      break;
		    	      
		    	      case "-":res=operand2-operand1;
   	                  break;
   	            
		    	      case "*":res=operand2*operand1;
   	                  break;
   	            
		    	      case "/":res=operand2/operand1;
   	                  break;
   	            
		    	      case "^":res=Math.pow(operand2, operand1);
		    	      break;
   	            
		    	     default:res=res+operand1; //case for single functions
   	                 break;
		    	}
		    	st2.push(res);
		   }
		    if(error)
		    	infix="Invalid Input "+String.valueOf(st2.pop());
		    else
		       infix=String.valueOf(st2.pop());
		    
		   ShowPanel.l1.setText(infix);
           res=0.0;
		}
	}
	
	
	//infix to postfix
	public Queue<String> toPostfixExp(String s)
	{
		Stack<Operators> st1=new Stack<Operators>();
		Queue<String> que=new LinkedList<String>();
		
		Operators op=null;
		Boolean negNo=false; // -3 *5 will be treated - as an operator, thereby to check that
		
		for(int i=0;i<s.length();i++)
		{
		    char symbol=s.charAt(i);
			//System.out.println(symbol+"for");
			String operand="";
			
			if(s.charAt(0)=='-')
				negNo=true;
				
			
		    while(symbol>=48 && symbol<=57 || symbol=='.' || symbol>='a' && symbol<'z' || symbol=='(' || symbol==')' || negNo)
			{
			    	
				operand+=String.valueOf(symbol);  
			   // System.out.println(operand+" in while");	
				if(i==s.length()-1)
					   break;
				else
				  {
					   symbol=s.charAt(++i);
					   negNo=false;
				  }
			}
			que.offer(operand);
		    
			
			if(symbol=='+' || symbol=='-' || symbol=='*'|| symbol=='/' || symbol=='^')
			{
			    	//System.out.println("in if");
			    	
			    //using Operators enum to assign precedence and symbol
				switch(symbol)
				{
				   case '+' :  op=Operators.PLUS;
				   break;
				   
				   case '-' :  op=Operators.MINUS;
		           break;
		           
				   case '/' :  op=Operators.DIVIDE;
		           break;
		           
				   case '*' :  op=Operators.MULTIPLY;
		           break;
		           
				   case '^': op=Operators.POWER;
				   break;
		           
		           default: System.err.println("Invalid Operator");
		           break;
				}
				
				
			    while(!st1.isEmpty() && op.getPrece()<=st1.peek().getPrece())
			    {
					    String symb=st1.pop().getSymb();
					    //System.out.println(symb);
					    que.offer(symb);
				}
				st1.push(op);
				
				
			}
	   }
		
		while(!st1.isEmpty()) //get remaining operators from stack 
		{
			que.offer(st1.pop().getSymb());
		}
		
	   return que;
	}//function end
	
}//class end


