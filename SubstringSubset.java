package Recursion;

public class SubstringSubset {

	public static String substringGenerator(String text, int length)
	{
		if (text.length()==1)
			return text;
		else if (text.length() != length)
			return text + substringGenerator(text.substring(0, text.length()-1), length-1);
		else
			return text + substringGenerator(text.substring(1, text.length()), length-1);
	}
	
	public static void main(String []args)
	{
		System.out.println(substringGenerator("rum", 3));
	}
}
