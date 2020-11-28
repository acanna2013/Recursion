package Recursion;

import static java.lang.System.*;

public class Chickens
{
	public static int countChickens(String word)
	{
		if (word.length()<7)
			return 0;
		else if (word.indexOf("chicken") >= 0) {
			String word2 = word.substring(0, word.indexOf("chicken")) + word.substring(word.indexOf("chicken")+7);
			return 1 + countChickens(word2);
		}
			else
			return 0 + countChickens(word.substring(1));
	}
	
	public static void main(String []args)
	{
		System.out.println(countChickens("itatfun"));
		System.out.println(countChickens("itatchickenfun"));
		System.out.println(countChickens("chchickchickenenicken"));
		System.out.println(countChickens("chickchickfun"));
		System.out.println(countChickens("chickenbouncetheballchicken"));
		
	}
}