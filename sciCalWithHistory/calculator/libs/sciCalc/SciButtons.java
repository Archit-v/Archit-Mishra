package sciCalc;

public class SciButtons {
	
	public static double dosin(double d)
	{
		
		return Math.sin(Math.toRadians(d));	
		
	}
	
	public static double docos(double d)
	{
		
		return Math.cos(Math.toRadians(d));	
		
	}

	public static double dotan(double d)
	{
		
		return Math.tan(Math.toRadians(d));	
		
	}
	
	public static double dologE(double x)
	{
	
		return Math.log(x);
	}
	
	public static double docosec(double d)
	{
		
		return 1/Math.sin(Math.toRadians(d));
	}
	
	public static double dosec(double d)
	{
		
		return 1/Math.cos(Math.toRadians(d));
	}
	
	public static double docot(double d)
	{
		
		return 1/Math.tan(Math.toRadians(d));
	}
	
	public static double doExpo(double x,double y)
	{
		
		return Math.pow(x,y);
	}
	
	public static double dolog(double val)
	{
		return Math.log10(val);
	}
}
