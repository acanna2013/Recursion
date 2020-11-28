package Recursion;
public class Find {
	public static boolean find(String text, String str)
	{
		return find(text, str, 0);
	}

	private static boolean find(String text, String str, int index)
	{
		if(str.length() > text.length())
			return false;
		
		if(text.startsWith(str))
			return true;
		
		return find(text.substring(1), str, index+1);

	}
	
	   public static void main(String[] args)
	   {
		   System.out.println(find("Mississippi", "sip"));
		   System.out.println("Expected: true");
		   System.out.println(find("Mississippi", "sisip"));
		   System.out.println("Expected: false");
		   System.out.println(find("shoe", "oe"));
		   System.out.println("Expected: true");
	   }
	
	
}
