package Recursion;

public class SquareRootApprox {
	
	public static double squareRoot(double x)
	{
		return squareRootGuess(x, 5);
	}
	public static double squareRootGuess(double x, double g)
	{
		
		if (g*g <= x+0.001 && g*g >= x-0.001 || g*g == x)
		{
			return g;
		}
		else 
			return squareRootGuess(x, (g+x/g)/2);
	}
	
	public static void main (String []args)
	{
		System.out.println(squareRoot(25));
	}
}
