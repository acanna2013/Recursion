package Recursion;

import java.util.Arrays;

public class Consecutive {
	public static boolean consecutive(int[] a){
		if(a.length == 1)
			return false;
		else if (a[0]==a[1]-1)
			return true;
		return consecutive(a, 1);
	}
	
	public static boolean consecutive(int[] a, int index)
	{
		return consecutive(Arrays.copyOfRange(a, index, a.length));
	}
	
	public static void main(String []args)
	{
		int[] a = {2,4,8,3,6,1,5,8,10,2,5,9}; //returns false
		System.out.println(consecutive(a));
		int[] b = {7,3,5,1,9,6,8,2,6,7,2,8}; //returns true
		System.out.println(consecutive(b));
		int[] c = {7,3,5,1,9,6,8,2,6,9,2,3}; //returns true
		System.out.println(consecutive(c));
	}
}
