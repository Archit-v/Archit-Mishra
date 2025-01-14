package calculator;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JPanel;
import sciCalc.SciButtons;

//class to implement Scientific UI

public class SciPanel extends JPanel implements ActionListener
{
    	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	    //Functional Buttons
		JButton sin;
    	JButton cos;
    	JButton tan;
    	JButton sec;
    	JButton cosec;
    	JButton cot;
    	JButton logE;
    	JButton log;
    	JButton expo;
    	JButton clear;
    	JButton change;
    	JButton rightBracket;
    
    	//Number buttons
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
    	
    	
    	public static double res;
    	
    	
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
        	 expo=new JButton("exp");
        	 clear=new JButton("clr");
        	 change=new JButton("change");
        	 rightBracket=new JButton(")");
        	 none=new JButton("none");
        	
        	 
        	 res=0.0;
        	
        	
        	sin.addActionListener(this);
        	cos.addActionListener(this);
        	tan.addActionListener(this);
        	cosec.addActionListener(this);
        	sec.addActionListener(this);
        	logE.addActionListener(this);
        	log.addActionListener(this);
        	expo.addActionListener(this);
        	cot.addActionListener(this);
        	clear.addActionListener(this);
        	change.addActionListener(this);
        	neg.addActionListener(this);
        	rightBracket.addActionListener(this);
        	
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
        	this.add(expo);
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
        	this.add(rightBracket);
        	this.add(clear);
        	this.add(none);
        
        	
    	}
    	
    	public void actionPerformed(ActionEvent e)
    	{
    		//Has shared variable infix coming from module Button
    		
    		char last='a';
    		if(Button.infix!="")
    		 last=Button.infix.charAt(Button.infix.length()-1);
    		
    		//functional buttons upon hit
    		if(e.getSource().equals(change))
    		{
    			CalcPanel.changePanel();
    		}
    		
    		else if(e.getSource().equals(sin))
    		{
    		   
    			if(!(last>=48 && last<=57)) //you cant insert sin after an operand
    			{
    				Button.infix+="sin(";
                  ShowPanel.l1.setText(Button.infix);  
            
    			}
    		}
    		
    		else if(e.getSource().equals(cos))
    		{
    			if(!(last>=48 && last<=57))
    			{
    				Button.infix+="cos(";
    			 ShowPanel.l1.setText(Button.infix);
              
               
    			}
    		}
    		
    		else if(e.getSource().equals(tan))
    		{
    			if(!(last>=48 && last<=57))
    			{	
    				Button.infix+="tan(";
    			  ShowPanel.l1.setText(Button.infix);
               
                  
    			}
    		}
    		
    		else if(e.getSource().equals(cot))
    		{
    			if(!(last>=48 && last<=57))
    			{	
    			Button.infix+="cot(";	
    			 ShowPanel.l1.setText(Button.infix);
               
                 
    			}
    		}
    		
    		else if(e.getSource().equals(cosec))
    		{
    			
    			if(!(last>=48 && last<=57))
    			{
    				Button.infix+="cosec(";
    			 ShowPanel.l1.setText(Button.infix);  
               
                
    			}
    		}
    		
    		else if(e.getSource().equals(sec))
    		{
    			if(!(last>=48 && last<=57))
    			{
    				Button.infix+="sec(";
    			 ShowPanel.l1.setText(Button.infix);  
               
                
    			}
    		}
    		
    		else if(e.getSource().equals(expo))
    		{
    			 Button.infix+="^";
    			 ShowPanel.l1.setText(Button.infix);   
    		}
    		
    		
    		else if(e.getSource().equals(log))
    		{
    			if(!(last>=48 && last<=57))
    			{
    				Button.infix+="log(";
    			 ShowPanel.l1.setText(Button.infix);
               
                
    			}
    		}
    		
    		else if(e.getSource().equals(logE))
    		{
    			if(!(last>=48 && last<=57))
    			{
    				Button.infix+="loge(";
    			 ShowPanel.l1.setText(Button.infix);
               
               
    			}
    		}
    		
    		else if(e.getSource().equals(clear))
    		{
    			 Button.infix="";
    			 ShowPanel.l1.setText(Button.infix);
    			
              
    		}
    		
    		else if(e.getSource().equals(neg))
    		{
    			if(!(last>=48 && last<=57))
    			{
    				Button.infix+="neg(";
    			 ShowPanel.l1.setText(Button.infix);
    			
    			}
    		}
    		
    		
    		
    		//Non-funt. button upon hit
    		else if(e.getSource().equals(one))
    		{
    			Button.infix+="1";
    			 ShowPanel.l1.setText(Button.infix);
    		     
    		}
    		
    		else if(e.getSource().equals(two))
    		{
    			Button.infix+="2";
    			 ShowPanel.l1.setText(Button.infix);
   			   
    		}
    		
    		else if(e.getSource().equals(three))
    		{
    			Button.infix+="3";
    			 ShowPanel.l1.setText(Button.infix);
   			    
    		}
    		
    		else if(e.getSource().equals(four))
    		{
    			Button.infix+="4";
    			 ShowPanel.l1.setText(Button.infix);
   			    
    		}
    		
    		else if(e.getSource().equals(five))
    		{
    			Button.infix+="5";
    			ShowPanel.l1.setText(Button.infix);
   			   
    		}
    		
    		else if(e.getSource().equals(six))
    		{
    			Button.infix+="6";
    			ShowPanel.l1.setText(Button.infix);
    		}
    		
    		else if(e.getSource().equals(seven))
    		{
    			Button.infix+="7";
    			ShowPanel.l1.setText(Button.infix);
   			  
    		}
    		
    		else if(e.getSource().equals(eight))
    		{
    			Button.infix+="8";
    			ShowPanel.l1.setText(Button.infix);
   			    
    		}
    		else if(e.getSource().equals(nine))
    		{
    			Button.infix+="9";
    			ShowPanel.l1.setText(Button.infix);
    		}
    		
    		else if(e.getSource().equals(zero))
    		{
    			Button.infix+="0";
    			ShowPanel.l1.setText(Button.infix);
    		}
    		
    		else if(e.getSource().equals(rightBracket))
    		{
    			Button.infix+=")";
    			ShowPanel.l1.setText(Button.infix);
    		}
    	
    		
    	 } 
    	
    	
    	//reusable function to calculate trigonometric expressions
    	public static double sciCalculation(String trig)
    	{
    		DecimalFormat round=new DecimalFormat("##.###");
    		
    		Stack<String> s1=new Stack<String>(); //for sin cosine,etc
       	    Stack<Double> s2=new Stack<Double>(); //for operands
    		
    		
    		String operand1="";
    		
    		for(int i=0;i<trig.length();i++)
    		{
    			String op1="";
    			char c=trig.charAt(i);
    			
    			if(c>='a'&& c<'z') //for sin,cos,etc.
    			{
    			   while(c>='a'&& c<'z')
    			  {
    				op1+=c;
    				if(i!=trig.length()-1)
    				c=trig.charAt(++i);
    				else
    					break;
    			  }
    			  //System.out.println(op1);
    			  s1.push(op1);
    			}
    			if(c>=48 && c<=57)// for operands 
    			{
    			    while(c>=48 && c<=57)
    			    {
    				    operand1+=c;
    				    if(i!=trig.length()-1)
    				    c=trig.charAt(++i);
    				    else
    				    	break;
    			    }
    			   // System.out.println(operand1);
    			    s2.push(Double.parseDouble(operand1));
    			}
    		}
    		
    		
			while( !s1.isEmpty()) //while operator(sin,cos,log) stack is not empty
			{
				String op2=s1.pop();
				
				double operand2=0.0;
				if(!s2.isEmpty())
				 operand2=s2.pop();
				
		
				
				switch(op2)
				{
				case "sin":res=SciButtons.dosin(operand2);
				           break;
				           
				case "cos":res=SciButtons.docos(operand2);
		           break;
		           
				case "tan":res=SciButtons.dotan(operand2);
		           break;
		           
				case "cosec":res=SciButtons.docosec(operand2);
		           break;
				case "sec":res=SciButtons.dosec(operand2);
		           break;
		           
				case "cot":res=SciButtons.docot(operand2);
		           break;
		           
				case "log":res=SciButtons.dolog(operand2);
		           break;
		           
				case "loge":res=SciButtons.dologE(operand2);
		           break;
		           
				case "neg":res=0-operand2;
		           break;
		           
				}
		
			
				res=Double.parseDouble(round.format(res));
				//System.out.println("Result of SciPanel= "+ res);
				s2.push(res);  
				
		}
		return s2.pop();
		
    	}
        

}
