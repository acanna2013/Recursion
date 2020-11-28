package Recursion;

import java.util.ArrayList;

public class Grid {
	
	private static String[][] grid;
	private static int maxi, count;
	
	public Grid(int dim1, int dim2, String[] letters)
	{
		maxi = 0;
		count = 0;
		
		grid = new String[dim1][dim2];
		for (int r = 0; r< grid.length; r++)
		{
			for (int c = 0; c < grid[r].length; c++)
			{
				int rand = (int)(Math.random()*letters.length);
				grid[r][c] = letters[rand];	
			}
		}
		toString();
	}
	
	public static void setGrid(int dim1, int dim2, String[] letters)
	{
		Grid one = new Grid(dim1, dim2, letters);
	}
	
	public static int findMax(String letter)
	{
		return findMax(0,0, letter);
	}

	public static int findMax(int r, int c, String letter)
	{
		if (r<grid.length && c < grid[0].length && r >= 0 && c >= 0 && grid[r][c].equals(letter))
		{
			grid[r][c] = "visited";
			return 1 + findMax(r+1, c, letter) + findMax(r-1, c, letter) + 
					findMax(r, c+1, letter) + findMax(r, c-1, letter);
		}
		else 
			return 0;
	}
	
	public static int findMax1(String letter)
	{
		int maximum = 0;
		for (int r = 0; r < grid.length; r++)
		{
			for (int c = 0; c < grid[0].length; c++)
			{
				int num = findMax(r, c, letter);
				if (num > maximum)
					maximum = num;
			}
		}
		return maximum;
	}
	
	public String toString()
	{
		String matrix ="";
		for (int r = 0; r < grid.length; r++)
		{
			for(int c = 0; c < grid[0].length; c++)
			{
				matrix += grid[r][c] + " ";
			}
			matrix += "\n";
		}
		return matrix;
	}
}
	
