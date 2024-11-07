package calculator;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JPanel;
import sciCalc.SciButtons;

public class SciPanel extends JPanel implements ActionListener
{
    	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		JButton sin;
    	JButton cos;
    	JButton tan;
    	JButton sec;
    	JButton cosec;
    	JButton cot;
    	JButton logE;
    	JButton log;
    	JButton exp;
    	JButton clear;
    	JButton equals;
    	JButton change;
    	Stack<String> s1;
    	Stack<Double> s2;
    	String no1="";
    	double res;
    	
    	
    	JButton dot;
    	JButton one;
    	JButton two;
    	JButton four;
    	JButton five;
    	JButton six;
    	JButton seven;
    	JButton eight;
    	JButton nine;
    	JButton zero;
    	JButton neg;
    	JButton three;
    	
    	JButton none;
    	
    	//Error-public void SciPanel()
    	//Constructor became a method
    	
    	public  SciPanel()
    	{
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
    		neg=new JButton("-");
    		
    		
    		sin=new JButton("sin");
             cos=new JButton("cos");
        	 tan=new JButton("tan");
        	 sec=new JButton("sec");
        	 cosec=new JButton("cosec");
        	 cot=new JButton("cot");
        	 logE=new JButton("logE");
        	 log=new JButton("log");
        	 exp=new JButton("exp");
        	 clear=new JButton("clr");
        	 change=new JButton("change");
        	 equals=new JButton("equals");
        	 none=new JButton("none");
        	
        	 s1=new Stack<String>();
        	 s2=new Stack<Double>();
        	 res=0.0;
        	
        	sin.addActionListener(this);
        	cos.addActionListener(this);
        	tan.addActionListener(this);
        	cosec.addActionListener(this);
        	sec.addActionListener(this);
        	logE.addActionListener(this);
        	log.addActionListener(this);
        	exp.addActionListener(this);
        	cot.addActionListener(this);
        	clear.addActionListener(this);
        	change.addActionListener(this);
        	equals.addActionListener(this);
        	neg.addActionListener(this);
        	
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
        	
        	
        	this.setLayout(new GridLayout(0,4));
        	this.setPreferredSize(new Dimension(400,300));
        	
        	
        	this.add(sin);
        	this.add(cos);
        	this.add(sec);
        	this.add(tan);
        	this.add(log);
        	this.add(logE);
        	this.add(exp);
        	this.add(cot);
        	this.add(cosec);
        	this.add(one);
        	this.add(two);
        	this.add(three);
        	this.add(four);
        	this.add(five);
        	this.add(six);
        	this.add(seven);
        	this.add(eight);
        	this.add(nine);
        	this.add(zero);
        	this.add(neg);
        	this.add(change);
        	this.add(equals);
        	this.add(clear);
        	this.add(none);
        	
    	}
    	
    	public void actionPerformed(ActionEvent e)
    	{
    		
    		//functional buttons upon hit
    		if(e.getSource().equals(change))
    		{
    			CalcPanel.changePanel();
    		}
    		
    		else if(e.getSource().equals(sin))
    		{
    			
               ShowPanel.l1.setText("sin(");  
               
               
               s1.push("sin");
    		}
    		
    		else if(e.getSource().equals(cos))
    		{
    			
    			 ShowPanel.l1.setText(ShowPanel.l1.getText()+"cos(");
               
               
               s1.push("cos");
    		}
    		
    		else if(e.getSource().equals(tan))
    		{
    			
    			 ShowPanel.l1.setText(ShowPanel.l1.getText()+"tan(");
               
               
               s1.push("tan");
    		}
    		
    		else if(e.getSource().equals(cot))
    		{
    			
    			 ShowPanel.l1.setText(ShowPanel.l1.getText()+"cot(");
               
               s1.push("cot");
    		}
    		
    		else if(e.getSource().equals(cosec))
    		{
    			
    			 ShowPanel.l1.setText(ShowPanel.l1.getText()+"cosec(");  
               
               
               s1.push("cosec");
    		}
    		
    		else if(e.getSource().equals(exp))
    		{
    			
    			 s2.push(Double.parseDouble(no1));
    			 no1="";
    			 ShowPanel.l1.setText(ShowPanel.l1.getText()+"^");
                              
               
                 s1.push("exp");
    		}
    		
    		else if(e.getSource().equals(log))
    		{
    			
    			 ShowPanel.l1.setText(ShowPanel.l1.getText()+"log");
               
               
               s1.push("log");
    		}
    		
    		else if(e.getSource().equals(logE))
    		{
    			
    			 ShowPanel.l1.setText(ShowPanel.l1.getText()+"logE");
               
               
               s1.push("logE");
    		}
    		
    		else if(e.getSource().equals(clear))
    		{
    			
    			 ShowPanel.l1.setText("");
    			 no1="";
              
    		}
    		
    		else if(e.getSource().equals(neg))
    		{
    			
    			 ShowPanel.l1.setText(ShowPanel.l1.getText()+"-");
    			 no1+="-";
              
    		}
    		
    		
    		
    		//Non-funt. button upon hit
    		else if(e.getSource().equals(one))
    		{
    			 ShowPanel.l1.setText(ShowPanel.l1.getText()+"1");
    			 no1=no1+String.valueOf(1);
    		     
    		}
    		
    		else if(e.getSource().equals(two))
    		{
    			
    			 ShowPanel.l1.setText(ShowPanel.l1.getText()+"2");
   			     no1=no1+String.valueOf(2);
    		}
    		
    		else if(e.getSource().equals(three))
    		{
    			
    			 ShowPanel.l1.setText(ShowPanel.l1.getText()+"3");
   			     no1=no1+String.valueOf(3);
    		}
    		
    		else if(e.getSource().equals(four))
    		{
    			
    			 ShowPanel.l1.setText(ShowPanel.l1.getText()+"4");
   			     no1=no1+String.valueOf(4);
    		}
    		
    		else if(e.getSource().equals(five))
    		{
    			
    			ShowPanel.l1.setText(ShowPanel.l1.getText()+"5");
   			    no1=no1+String.valueOf(5);
    		}
    		
    		else if(e.getSource().equals(six))
    		{
    			
    			ShowPanel.l1.setText(ShowPanel.l1.getText()+"6");
   			    no1=no1+String.valueOf(6);
    		}
    		
    		else if(e.getSource().equals(seven))
    		{
    			
    			ShowPanel.l1.setText(ShowPanel.l1.getText()+"7");
   			    no1=no1+String.valueOf(7);
    		}
    		
    		else if(e.getSource().equals(eight))
    		{
    			
    			ShowPanel.l1.setText(ShowPanel.l1.getText()+"8");
   			    no1=no1+String.valueOf(8);
    		}
    		else if(e.getSource().equals(nine))
    		{
    			
    			ShowPanel.l1.setText(ShowPanel.l1.getText()+"9");
   			    no1=no1+String.valueOf(9);
    		}
    		
    		else if(e.getSource().equals(zero))
    		{
    			
    			ShowPanel.l1.setText(ShowPanel.l1.getText()+"0");
   			    no1=no1+String.valueOf(0);
    		}
    		
    		
    		else if(e.getSource().equals(equals))
    		{
    			s2.push(Double.parseDouble(no1));
    			while( !s1.isEmpty())
    			{
    				String op=s1.pop();
    				double operand=s2.pop();
    				
    				switch(op)
    				{
    				case "sin":res=SciButtons.dosin(operand);
    				           break;
    				           
    				case "cos":res=SciButtons.docos(operand);
			           break;
			           
    				case "tan":res=SciButtons.dotan(operand);
			           break;
			           
    				case "cosec":res=SciButtons.docosec(operand);
			           break;
    				case "sec":res=SciButtons.dosec(operand);
			           break;
    				case "cot":res=SciButtons.docot(operand);
			           break;
    				case "log":res=SciButtons.dolog(operand);
			           break;
    				case "logE":res=SciButtons.dologE(operand);
			           break;
    				case "exp":
    				           double base=s2.pop();
    					
    					       res=SciButtons.doExpo(base,operand);
			                   break;
			           
    				}
    				
    				s2.push(res);  
    				no1="";
    		}
    		
    		ShowPanel.l1.setText(String.valueOf(s2.pop()));}
    		
    	 } 
        

}
