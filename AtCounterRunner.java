package Recursion;

import static java.lang.System.*;

public class AtCounterRunner
{
	public static void main(String args[])
	{
		//instantiate an AtCounter
		AtCounter one = new AtCounter();
		//test the code
		System.out.println(one.toString());
		System.out.println(one.countAts(4, 6));

	}
}