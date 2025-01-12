package calculator;

public enum Operators {
	
	PLUS(1,"+"),
	MINUS(1,"-"),
	MULTIPLY(2,"*"),
	DIVIDE(2,"/"),
    POWER(3,"^");
    
	private int prece;
	private String symb;
	Operators(int prece,String symb)
	{
		this.prece=prece;
		this.symb=symb;
	}
	
	public int getPrece()
	{
		return this.prece;
	}
	
	public String getSymb()
	{
		return this.symb;
	}
}
