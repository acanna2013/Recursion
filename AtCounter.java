package Recursion;

import static java.lang.System.*;

public class AtCounter
{
   private String[][] atMat;

	public AtCounter()
	{
		//size the matrix
		//use nested loops to randomly load the matrix
		//you will need to use Math.random()
		
		atMat = new String[10][10];
		for (int r = 0; r < atMat.length; r++)
		{
			for(int c = 0; c < atMat[0].length; c++)
			{
				int random = (int)(Math.random()*2);
				if (random == 0)
				{
					atMat[r][c] = "@";
				}
				else if (random ==1)
					atMat[r][c] = "-";
			}
		}
	}

	public int countAts(int r, int c)
	{
		//add in recursive code to count up the # of @s connected
		//start checking at spot [r,c]
		if (r<10 && c < 10 && r >= 0 && c >= 0 && atMat[r][c].equals("@"))
		{
			atMat[r][c] = "-";
			return 1 + countAts(r+1, c) + countAts(r-1, c) + 
					countAts(r, c+1) + countAts(r, c-1);
		}
		else 
			return 0;
	}

	/*
	 *this method will return all values in the matrix
	 *this method should return a view of the matrix
	 *that looks like a matrix
	 */
	public String toString()
	{
		String matrix ="";
		for (int r = 0; r < atMat.length; r++)
		{
			for(int c = 0; c < atMat[0].length; c++)
			{
				matrix += atMat[r][c];
			}
			matrix += "\n";
		}
		return matrix;
	}
}